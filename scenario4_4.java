package pageObject4;

import org.junit.Assert;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class scenario4_4 {
	Response res ;
	
	@Given("rates API for Specific date foreign Exchange rates with symbol and base")
	public void rates_api_for_specific_date_foreign_exchange_rates_with_symbol_and_base() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		RestAssured.baseURI="https://api.ratesapi.io";
	}

	@When("The API with symbol and base is available")
	public void the_api_with_symbol_and_base_is_available() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		res=RestAssured.get("/api/2010-01-12?base=USD&symbols=GBP");
	}

	@Then("verify the response status code of symbol and  base api is {int}")
	public void verify_the_response_status_code_of_symbol_and_base_api_is(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Assert.assertEquals(200, res.getStatusCode());
	}


}
