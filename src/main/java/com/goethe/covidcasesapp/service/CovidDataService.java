package com.goethe.covidcasesapp.service;

import com.goethe.covidcasesapp.vo.CovidCasesInfoResponse;

public interface CovidDataService {
  public CovidCasesInfoResponse getCovidData(String state, String city);
  
}
