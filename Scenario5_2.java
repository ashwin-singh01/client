package pageObject5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.junit.Assert;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Scenario5_2 {
	Response res;
	@Given("rates API for  Specific date foreign Exchange rates with symbol")
	public void rates_api_for_specific_date_foreign_exchange_rates_with_symbol() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    RestAssured.baseURI="https://api.ratesapi.io";
	}

	@When("The API with symbols is Available")
	public void the_api_with_symbols_is_available() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		res=RestAssured.get("/api/2010-01-12?symbols=USD,GBP");

	}

	@Then("verify the response of the api")
	public void verify_the_response_of_the_api() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		JsonPath  jp=res.jsonPath();
		String base=jp.get("base");
		System.out.println("Base  is:"+base);
		Assert.assertEquals("EUR", base);
		JsonPath jP=res.jsonPath();
		 HashMap<String, Double> value=jP.get("rates");
		 Set<Entry<String,Double>> rate=value.entrySet();
			for(Map.Entry<String, Double> val:rate)
			{
				System.out.println(val.getKey()+"  :"+val.getValue());
				if(val.getKey()=="USD" || val.getKey()=="GBP") {
				System.out.println("Passed");}
				}

	}

	@Then("assert the date")
	public void assert_the_date() {
	    JsonPath js1=res.jsonPath();
		String date=js1.get("date");
		System.out.println("Date is:"+date);
		Assert.assertEquals("2010-01-12", date);
	}

}
