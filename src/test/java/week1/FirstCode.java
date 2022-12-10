package week1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FirstCode {
	@Test
	public void testGetAllIncidents() {
		//Endpoint with resources
		RestAssured.baseURI="https://dev128329.service-now.com/api/now/table/incident";
		RestAssured.authentication=RestAssured.basic("admin", "fhV6YjhR!0A@");
		
		//Construct the request
		RequestSpecification inputrequest=RestAssured.given();
		
		//Send the request
		Response response = inputrequest.get();
		//Validate the response
		response.prettyPrint();
	}

}
