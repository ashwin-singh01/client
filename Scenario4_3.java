package pageObject4;

import org.junit.Assert;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Scenario4_3 {
	Response res ;
		
	@Given("rates API for Specific date foreign Exchange rates with base")
	public void rates_api_for_specific_date_foreign_exchange_rates_with_base() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		RestAssured.baseURI="https://api.ratesapi.io";
	}

	@When("The API with base is Available")
	public void the_api_with_base_is_available() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		res=RestAssured.get("/api/2010-01-12?base=USD");
	}

	@Then("verify the response status code of base API is {int}")
	public void verify_the_response_status_code_of_base_api_is(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		int  status2=res.getStatusCode();
		System.out.println("Status code:"+status2);
		Assert.assertEquals(200, status2);

		
	}

	@Then("symbol API response status line is HTTP\\/{double} {int}  OK")
	public void symbol_api_response_status_line_is_http_ok(Double double1, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		String http2=res.getStatusLine();
		System.out.println("Httpcode"+http2);
		Boolean bl=http2.contains("1.1");
		Assert.assertEquals(true, bl);
	}
}
