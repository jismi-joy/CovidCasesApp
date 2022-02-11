# CovidCasesApp
## Objective
Find covid case count of a city.
## Solution
Created Rest controller CovidCaseInfoController to handle the Rest APIs related to covid.

created a get mapping method getCovidCases() to retreive the count of active covid cases.
In this method two path variables state and city are provided as parameter.

Created dto object CovidCasesInfoResponse which will be returned as response.

## Execution Steps
Invoke the Rest GET API "http://localhost:9000/getcovidcases/{state}/{city}" to retreive the count of active covid cases.
Returns the ourput as a json file
