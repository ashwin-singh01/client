package pageObject5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.*;
import java.util.Set;

import org.junit.Assert;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Scenario5_3 {
	Response res;
	@Given("rates api for Specific date foreign Exchange rates with base")
	public void rates_api_for_specific_date_foreign_exchange_rates_with_base() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    RestAssured.baseURI="https://api.ratesapi.io";
	}

	@When("The API with base is Available with date")
	public void the_api_with_base_is_available_with_date() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		res=RestAssured.get("/api/2010-01-12?symbols=USD,GBP");
	}

	@Then("assert the response of API")
	public void assert_the_response_of_api() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		JsonPath js=res.jsonPath();
		String base=js.get("base");
		System.out.println("Base  is:"+base);
		Assert.assertEquals("EUR", base);
		JsonPath jp2=res.jsonPath();
		 HashMap<String, Double> value=jp2.get("rates");
		 Set<Entry<String,Double>> rate=value.entrySet();
			for(Map.Entry<String, Double> val:rate)
			{
				System.out.println(val.getKey()+"  :"+val.getValue());
				if(val.getKey()=="USD" || val.getKey()=="GBP") {
				System.out.println("Pass");}
				}
	    
	}

}
