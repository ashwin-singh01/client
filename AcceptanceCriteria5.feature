Feature: Assert the response of Specific date Foreign  Exchange rates api
     
	  Scenario: Assert the Response of  Specific date foreign exchange rate api response
    Given Rates api for the Specific date Foreign Exchange rates
    When The API is Available and assert the  response
    Then Assert the response
   
    Scenario: Assert the response of  Specific date foreign Exhange with symbol
    Given rates API for  Specific date foreign Exchange rates with symbol
    When The API with symbols is Available
    Then verify the response of the api
    And assert the date
   
   
   Scenario: Assert the response of Specific date foreign Exhange with base
   Given rates API for Specific date foreign Exchange rates with base
   When The API with base is Available with date
   Then assert the response of API
   
   
   Scenario: Assert the response of  Specific date foreign Exhange with symbol and base 
   Given rates API for  Specific date foreign Exchange rates with symbol and base 
   When The API with symbol and base is Available
   Then assert  response of API and assert the date given