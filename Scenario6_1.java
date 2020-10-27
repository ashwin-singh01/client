package pageObject6;

import java.time.LocalDate;

import org.junit.Assert;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Scenario6_1 {
	Response res;
	@Given("Rates api with future date for the Specific date Foreign Exchange rates")
	public void rates_api_with_future_date_for_the_specific_date_foreign_exchange_rates() {
	    // Write code here that turns the phrase above into concrete action
	    //throw new io.cucumber.java.PendingException();
		RestAssured.baseURI="https://api.ratesapi.io";
	}

	@When("The api is Available")
	public void the_api_is_available() {
	    // Write code here that turns the phrase above ino concrete actions
	    //throw new io.cucumber.java.PendingException();
		res=RestAssured.get("/api/2021-01-12");
	    
	}

	@Then("Verify the  response with current date")
	public void verify_the_response_with_current_date() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		LocalDate date=LocalDate.now();
		System.out.println("Currentdate::"+date);
		JsonPath jp=res.jsonPath();
		String resdate=jp.get("date");
		System.out.println("Date in future:"+resdate);
		Assert.assertEquals(resdate,date);
	}

}
