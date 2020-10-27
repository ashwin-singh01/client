Feature: Test for API

	Scenario: Assert the correct response
	Given Incorrect or incomplete API for Latest Foreign Exchange Rates
	When The incomplete api is available
	Then Assert the response is success
	
	Scenario: Assert the correct response with symbol
	Given Incorrect or incomplete API for Latest Foreign Exchange Rates with symbol
	When The incomplete api available
	Then Assert the response is 200
	
	Scenario: Assert the correct response with base
	Given Incorrect or incomplete API for Latest Foreign Exchange Rates base
	When The incomplete api is given
	Then Assert the status response
	
	Scenario: Assert the correct response with base and symbol
	Given Incorrect or incomplete API for Latest Foreign Exchange Rates with base and symbol
	When The api incomplete is provided
	Then Assert the response is success and symbol