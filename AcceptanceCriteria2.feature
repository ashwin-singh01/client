Feature: Rates API

	Scenario: Assert the response
	Given Rates API for Latest Foreign Exchange Rates
	When The api is available
	Then Verify the response is success
	
	Scenario: Assert the response with symbol
	Given Rates API for Latest Foreign Exchange Rates with symbol
	When The api available
	Then Verify the response is 200
	
	Scenario: Assert the response with base
	Given Rates API for Latest Foreign Exchange Rates base
	When The api is given
	Then Verify the status response
	
	Scenario: Assert the response with base and symbol
	Given Rates API for Latest Foreign Exchange Rates with base and symbol
	When The api is provided
	Then Verify the response is success and symbol