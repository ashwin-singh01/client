package pageObject5;
import static io.restassured.RestAssured.given;

import org.junit.Assert;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Scenario5_1 {
	Response res;
	@Given("Rates api for the Specific date Foreign Exchange rates")
	public void rates_api_for_the_specific_date_foreign_exchange_rates() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		RestAssured.baseURI="https://api.ratesapi.io";
	}

	@When("The API is Available and assert the  response")
	public void the_api_is_available_and_assert_the_response() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		res=RestAssured.get("/api/2010-01-12");

	}

	@Then("Assert the response")
	public void assert_the_response() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		res=given().contentType(ContentType.JSON).log().all().get();
		String b=given().contentType(ContentType.JSON).log().all().get("/2010-01-12").then().extract().path("base");
		
		res.prettyPrint();
		System.out.println("value is "+b);
		Assert.assertEquals("EUR", b);
	
		String Date=given().contentType(ContentType.JSON).log().all().get("/2010-01-12").then().extract().path("date");
		System.out.println("Date:"+Date);
		Assert.assertEquals("2010-01-12", Date);

	}


}
