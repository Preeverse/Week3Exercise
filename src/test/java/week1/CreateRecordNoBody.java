package week1;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;
import io.restassured.http.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateRecordNoBody {
	@Test
	public void testGetAllIncidents() {
		//Endpoint with resources
		RestAssured.baseURI="https://dev128329.service-now.com/api/now/table/change_request";
		RestAssured.authentication=RestAssured.basic("admin", "fhV6YjhR!0A@");
		
	
				                          ;
		//Construct a map for multiple Query params
				Map<String,String> queryMap= new HashMap<String,String>();
				queryMap.put("short_description", "hello");
				queryMap.put("description","hello world");
				//Construct the request single param
				RequestSpecification inputrequest=RestAssured
						                                 .given().contentType(ContentType.JSON)
						                                 ;
				
		//Send the request
		Response response = inputrequest.post();
		//Validate the response
		response.prettyPrint();
	}

}
