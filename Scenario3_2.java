package pageObject3;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Scenario3_2 {
	Response res ;

	@Given("Incorrect or incomplete API for Latest Foreign Exchange Rates with symbol")
	public void incorrect_or_incomplete_api_for_latest_foreign_exchange_rates_with_symbol() {
	    // Write code here that turns the phrase above into concrete actions
		RestAssured.baseURI = "https://api.ratesapi.io";
	    //throw new io.cucumber.java.PendingException();
	}

	@When("The incomplete api available")
	public void the_incomplete_api_available() {
	    // Write code here that turns the phrase above into concrete actions
		res=RestAssured.get("/api/latest?symbols=USD,GBP");
		//throw new io.cucumber.java.PendingException();
	}

	@Then("Assert the response is {int}")
	public void assert_the_response_is(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		JsonPath jp=res.jsonPath();
		String error=jp.get("error");
		Boolean output=error.contains("invalid");
		System.out.println(output);
		Assert.assertEquals(true, output);
		
		//Assert the Status
		int status=res.getStatusCode();
		System.out.println(status);
		Assert.assertEquals(400, status);	}

}
