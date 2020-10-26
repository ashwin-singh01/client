package pageObject;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Scenario1 {
Response res ;

@Given("Rates API for LatestForeign Exchange Rates")
public void rates_api_for_latest_foreign_exchange_rates() {
    // Write code here that turns the phrase above into concrete actions
	RestAssured.baseURI = "https://api.ratesapi.io";
    //throw new io.cucumber.java.PendingException();
}
@When("The API is available")
public void the_api_is_available() {
    // Write code here that turns the phrase above into concrete actions
	res=RestAssured.get("/api/latest");
	
    //throw new io.cucumber.java.PendingException();
}

@Then("Verify the status code of the response is success")
public void verify_the_status_code_of_the_response_is_success() {
    // Write code here that turns the phrase above into concrete actions
    res.statusCode();
    System.out.println("Code"+res.getStatusCode());
    Assert.assertEquals(200, res.statusCode());
	//throw new io.cucumber.java.PendingException();
}


}
