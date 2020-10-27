Feature: Assert the future date provided at specified date in Foreign  Exchange rates api

	  Scenario: Assert the Response of date 
    Given Rates api with future date for the Specific date Foreign Exchange rates
    When The api is Available
    Then Verify the  response with current date
    