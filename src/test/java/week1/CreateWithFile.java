package week1;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;
import io.restassured.http.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateWithFile {
	@Test
	public void testGetAllIncidents() {
		//Endpoint with resources
		RestAssured.baseURI="https://dev128329.service-now.com/api/now/table/change_request";
		RestAssured.authentication=RestAssured.basic("admin", "fhV6YjhR!0A@");
		//File newfile=new File("./src/test/resources/DataFile.json");
	
			
				//Construct the request single param
		//Log the Request as well .log().all()
				RequestSpecification inputrequest=RestAssured
						                                 .given().contentType(ContentType.JSON)
						                                 .body("{\"short_description\":\"hello\",\r\n"
						                                 		+ "\"description\":\"hello world\"}\r\n"
						                                 		+ "")
						                                 .log().all()
						                                 ;
				
		//Send the request
		Response response = inputrequest.post();
		//Validate the response and LOG it using then() method for response
		response.then().log().all();
	}

}
