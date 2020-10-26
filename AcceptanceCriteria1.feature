Feature: Test the API

	Scenario: Assert the Success Status
	Given Rates API for LatestForeign Exchange Rates
	When The API is available
	Then Verify the status code of the response is success
	
	Scenario: Assert the Success Status with symbol
	Given Rates API for LatestForeign Exchange Rates with symbol
	When The API available
	Then Verify the status code of the response is 200
	
	Scenario: Assert the Success Status with base
	Given Rates API for LatestForeign Exchange Rates base
	When The API is given
	Then Verify the status code of the response
	
	Scenario: Assert the Success Status with base and symbol
	Given Rates API for LatestForeign Exchange Rates with base and symbol
	When The API is provided
	Then Verify the status code of the response is success and symbol
	