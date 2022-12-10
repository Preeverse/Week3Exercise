package week1;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UseAssertions {
	//Verify the status code
	@Test
	public void testStatusCode() {
	
		//Endpoint with resources
		RestAssured.baseURI="https://dev128329.service-now.com/api/now/table/incident";
		RestAssured.authentication=RestAssured.basic("admin", "fhV6YjhR!0A@");
		
		//Construct the request
		//RequestSpecification inputrequest=RestAssured.given();
		
		//Send the request- you can also bypass using specification
		Response response = RestAssured.get();
		//Validate the response
		response.then().assertThat().statusCode(200);
	}
	
	//Verify the incident number exists
		@Test
		public void testIncidentnumber() {
			RestAssured.baseURI="https://dev128329.service-now.com/api/now/table/incident";
			RestAssured.authentication=RestAssured.basic("admin", "fhV6YjhR!0A@");
			Response response = RestAssured.get();
			//Validate the response
			response.then().assertThat().body("result.number", Matchers.hasItem("INC0000047"));
		}
		//Verify the incident number contains INC 
				@Test
				public void testINCinNumber() {
					RestAssured.baseURI="https://dev128329.service-now.com/api/now/table/incident";
					RestAssured.authentication=RestAssured.basic("admin", "fhV6YjhR!0A@");
					Response response = RestAssured.given().contentType(ContentType.JSON).post();
					//Validate the response
					response.then().assertThat().body("result.number", Matchers.containsString("INC"));
				}
				
				//Verify the incident number equals the expected value from the array response
				@Test
				public void testIncNumEquals () {
					RestAssured.baseURI="https://dev128329.service-now.com/api/now/table/incident";
					RestAssured.authentication=RestAssured.basic("admin", "fhV6YjhR!0A@");
					Response response = RestAssured.given().contentType(ContentType.JSON).post();
					//Validate the response
					response.then().assertThat().body("result.number", Matchers.containsString("INC"));
				}
			

}
