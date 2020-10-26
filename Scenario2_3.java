package pageObject2;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Scenario2_3 {
	Response res ;
	
	@Given("Rates API for Latest Foreign Exchange Rates base")
	public void rates_api_for_latest_foreign_exchange_rates_base() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException()
		RestAssured.baseURI = "https://api.ratesapi.io";
	    
	}

	@When("The api is given")
	public void the_api_is_given() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		res=RestAssured.get("?base=USD");
		
	}

	@Then("Verify the status response")
	public void verify_the_status_response() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		res.statusLine();
	    System.out.println(res.statusLine());
	    Assert.assertEquals("HTTP/1.1 200 OK", res.statusLine());
		
	}


}
