Feature: Test the  success status of Specific date Foreign  Exchange rates api
     
	  Scenario: Assert status of Specific date foreign exchange rate api response
    Given Rates API for the Specific date Foreign Exchange rates
    When The API is ailable
    Then verify the status code of response success
   
    Scenario: Assert status of response of Specific date foreign Exhange with symbol
    Given rates API for Specific date foreign Exchange rates with symbol
    When The API with symbol is Available
    Then verify the response status code of symbol api is 200
   

   Scenario: Assert status of response of Specific date foreign Exhange with base
   Given rates API for Specific date foreign Exchange rates with base
   When The API with base is Available
   Then verify the response status code of base API is 200
   And symbol API response status line is HTTP/1.1 200  OK
   
   Scenario: Assert status of response of Specific date foreign Exhange with symbol and base 
   Given rates API for Specific date foreign Exchange rates with symbol and base 
   When The API with symbol and base is available
   Then verify the response status code of symbol and  base api is 200