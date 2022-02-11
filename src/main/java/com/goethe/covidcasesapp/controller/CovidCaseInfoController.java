package com.goethe.covidcasesapp.controller;


import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.goethe.covidcasesapp.service.CovidDataService;
import com.goethe.covidcasesapp.vo.CovidCasesInfoResponse;

/**
 * 
 * @author jismi
 * CovidCaseInfoController  : supplying the covid count of a specific city under a state.
 *
 */

@RestController
public class CovidCaseInfoController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CovidCaseInfoController.class);
    @Autowired
	private CovidDataService covidDataService;
	/**
	 * 
	 * @param state
	 * @param city
	 * @return json output of city and covid case count
	 */
	 
	@GetMapping(value = "/getcovidcases/{state}/{city}")
	public ResponseEntity getCovidCases(@PathVariable(name="state") String state, @PathVariable(name="city") String city) {
		LOGGER.info("In getCovidCases");
	
		if(isInvalidParam(state, city)) {
			return new ResponseEntity("Invalid Params", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<CovidCasesInfoResponse>( covidDataService.getCovidData(state, city), HttpStatus.OK);
	}

    private boolean isInvalidParam(String state, String city) {
    	if(StringUtils.isEmpty(state) || StringUtils.isEmpty(city))
    	{
    		return true;
    	}
    	return false;
    }

}

