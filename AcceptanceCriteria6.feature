Feature: Assert the future date response
     
	  Scenario: Assert the Response of Specific date
    Given Rates api with future date for the Specific date Foreign Exchange rates
    When The api is Available
    Then Verify the  response with current date
    