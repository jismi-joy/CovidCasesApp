package com.goethe.covidcasesapp.controller;


import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

	/**
	 * 
	 * @param state
	 * @param city
	 * @return
	 */
	 
	@GetMapping(value = "/getcovidcases/{state}/{city}")
	public ResponseEntity getCovidCases(@PathVariable(name="state") String state, @PathVariable(name="city") String city) {
		LOGGER.info("In getCovidCases");
		if(isInvalidParam(state, city)) {
			return new ResponseEntity("Invalid Params", HttpStatus.BAD_REQUEST);
		}
		// Calling rest api
		final String uri = "https://data.covid19india.org/state_district_wise.json";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		JSONObject obj = new JSONObject(result);
		JSONObject stateData = new JSONObject(obj.get(state).toString());
		
		JSONObject districtData = new JSONObject(stateData.get("districtData").toString());
		JSONObject cityData  =  new JSONObject(districtData.get(city).toString());
	

		long covidCount = cityData.getLong("active");
		CovidCasesInfoResponse covidResponse = new CovidCasesInfoResponse();
		covidResponse.setCity(city);
		covidResponse.setCountCases(covidCount);
		
		System.out.println(covidCount);

		LOGGER.debug("Called rest api getAuthToken in debug");
		return new ResponseEntity<CovidCasesInfoResponse>( covidResponse, HttpStatus.OK);
	}

    private boolean isInvalidParam(String state, String city) {
    	if(StringUtils.isEmpty(state) || StringUtils.isEmpty(city))
    	{
    		return true;
    	}
    	return false;
    }

}

