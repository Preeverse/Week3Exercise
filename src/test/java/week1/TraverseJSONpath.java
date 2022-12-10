package week1;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TraverseJSONpath {
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
		//Get all the sys_id from the list
		List<String> list=response.jsonPath().getList("result.sys_id");
		System.out.println("Count of sys_id: "+list.size());
		//print one item from the whole array of json vlaues
		System.out.println("Sys_id is: "+response.jsonPath().get("result[0].sys_id"));
	}

}
