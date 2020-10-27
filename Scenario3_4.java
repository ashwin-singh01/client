package pageObject3;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Scenario3_4 {
	Response res ;
	@Given("Incorrect or incomplete API for Latest Foreign Exchange Rates with base and symbol")
	public void incorrect_or_incomplete_api_for_latest_foreign_exchange_rates_with_base_and_symbol() {
	    // Write code here that turns the phrase above into concrete actions
		RestAssured.baseURI = "https://api.ratesapi.io";
	    //throw new io.cucumber.java.PendingException();
	}

	@When("The api incomplete is provided")
	public void the_api_incomplete_is_provided() {
	    // Write code here that turns the phrase above into concrete action
		res=RestAssured.get("/api/latest?base=USD&symbols=GBP");
		//throw new io.cucumber.java.PendingException();
	}

	@Then("Assert the response is success and symbol")
	public void assert_the_response_is_success_and_symbol() {
	    // Write code here that turns the phrase above into concrete actions
		JsonPath jp=res.jsonPath();
		String error=jp.get("error");
		Boolean output=error.contains("invalid");
		System.out.println(output);
		Assert.assertEquals(true, output);
		
		//Assert the Status
		int status=res.getStatusCode();
		System.out.println(status);
		Assert.assertEquals(400, status);}

}
