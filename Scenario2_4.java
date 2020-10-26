package pageObject2;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Scenario2_4 {
	Response res ;
	
	@Given("Rates API for Latest Foreign Exchange Rates with base and symbol")
	public void rates_api_for_latest_foreign_exchange_rates_with_base_and_symbol() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		RestAssured.baseURI = "https://api.ratesapi.io";
	    
	}

	@When("The api is provided")
	public void the_api_is_provided() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException()
		res=RestAssured.get("/api/latest?base=USD&symbols=GBP");
		
	}

	@Then("Verify the response is success and symbol")
	public void verify_the_response_is_success_and_symbol() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		res.statusLine();
	    System.out.println(res.statusLine());
	    Assert.assertEquals("HTTP/1.1 200 OK", res.statusLine());
		
	}


}
