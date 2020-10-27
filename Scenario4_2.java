package pageObject4;

import org.junit.Assert;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Scenario4_2 {
	Response res ;
	
	@Given("rates API for Specific date foreign Exchange rates with symbol")
	public void rates_api_for_specific_date_foreign_exchange_rates_with_symbol() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		RestAssured.baseURI="https://api.ratesapi.io";
	}

	@When("The API with symbol is Available")
	public void the_api_with_symbol_is_available() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		res=RestAssured.get("/api/2010-01-12?symbols=USD");
		
	}

	@Then("verify the response status code of symbol api is {int}")
	public void verify_the_response_status_code_of_symbol_api_is(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		 String	http1=res.getStatusLine();
		   System.out.println("Httpcode"+http1);
		   Boolean b=http1.contains("1.1");
		   Assert.assertEquals(true, b);
	}


}
