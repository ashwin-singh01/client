package pageObject4;

import org.junit.Assert;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Scenario4_1 {
	Response res ;
	
	@Given("Rates API for the Specific date Foreign Exchange rates")
	public void rates_api_for_the_specific_date_foreign_exchange_rates() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		RestAssured.baseURI="https://api.ratesapi.io";
	}
	
	@When("The API is ailable")
	public void the_api_is_ailable() {
	    // Write code here that turns the phrase above into concrete actions
		res=RestAssured.get("/api/2010-01-12");
		//throw new io.cucumber.java.PendingException();
	}

	@Then("verify the status code of response success")
	public void verify_the_status_code_of_response_success() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	     int status =res.getStatusCode();
		System.out.println("Status code:"+status);
		Assert.assertEquals(200, status);

	}

}
