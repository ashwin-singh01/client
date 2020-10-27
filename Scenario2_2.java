package pageObject2;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Scenario2_2 {
	Response res ;

	@Given("Rates API for Latest Foreign Exchange Rates with symbol")
	public void rates_api_for_latest_foreign_exchange_rates_with_symbol() {
	    // Write code here that turns the phrase above into concreted actions
	    //throw new io.cucumber.java.PendingException()
		RestAssured.baseURI = "https://api.ratesapi.io";
	    
	}

	@When("The api available")
	public void the_api_available() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		res=RestAssured.get("/api/latest?symbols=USD,GBP");
		
	}

	@Then("Verify the response is {int}")
	public void verify_the_response_is(Integer int1) {
		res.statusLine();
	    System.out.println(res.statusLine());
	    Assert.assertEquals("HTTP/1.1 200 OK", res.statusLine());
		
	}

}
