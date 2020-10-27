package pageObject;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Scenario1_4 {
	Response res ;
	
	
	@Given("Rates API for LatestForeign Exchange Rates with base and symbol")
	public void rates_api_for_latest_foreign_exchange_rates_with_base_and_symbol() {
	    // Write code here that turns the phrase above into concrete action
	    //throw new io.cucumber.java.PendingException();
		RestAssured.baseURI = "https://api.ratesapi.io";
	    
	}

	@When("The API is provided")
	public void the_api_is_available() {
	    // Write code here that turns the phrase above into concrete actions
		res=RestAssured.get("/api/latest?base=USD&symbols=GBP");
		
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("Verify the status code of the response is success and symbol")
	public void verify_the_status_code_of_the_response_is_success() {
	    // Write code here that turns the phrase above into concrete actions
	    res.statusCode();
	    System.out.println("Code"+res.getStatusCode());
	    Assert.assertEquals(200, res.statusCode());
		//throw new io.cucumber.java.PendingException();
	}

}
