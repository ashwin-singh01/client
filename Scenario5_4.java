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

public class Scenario5_4 {
	Response res;
	@Given("rates API for  Specific date foreign Exchange rates with symbol and base")
	public void rates_api_for_specific_date_foreign_exchange_rates_with_symbol_and_base() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		RestAssured.baseURI="https://api.ratesapi.io";
	}

	@When("The API with symbol and base is Available")
	public void the_api_with_symbol_and_base_is_available() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		res=RestAssured.get("/api/2010-01-12?base=USD&symbols=GBP");
	}

	@Then("assert  response of API and assert the date given")
	public void assert_response_of_api_and_assert_the_date_given() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		JsonPath js1=res.jsonPath();
		String base2=js1.get("base");
		System.out.println("Base value::"+base2);
		Assert.assertEquals("USD", base2);
		//Asserting Symbols which are as query parameters
		JsonPath jP=res.jsonPath();
		 HashMap<String, Double> value=jP.get("rates");
		 Set<Entry<String,Double>> rate=value.entrySet();
			for(Map.Entry<String, Double> val:rate) {
			System.out.println(val.getKey()+"  :"+val.getValue());
				Assert.assertEquals("GBP", val.getKey());
			
			}

	}
}