package com.goethe.covidcasesapp.service.impl;

import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.goethe.covidcasesapp.service.CovidDataService;
import com.goethe.covidcasesapp.vo.CovidCasesInfoResponse;
@Service
public class CovidDataServiceImpl implements CovidDataService {

	@Override
	public CovidCasesInfoResponse getCovidData(String state, String city) {
		// TODO Auto-generated method stub
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
			    return covidResponse;
	}

}
