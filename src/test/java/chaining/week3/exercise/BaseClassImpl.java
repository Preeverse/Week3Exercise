package chaining.week3.exercise;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class BaseClassImpl {
	
	static RequestSpecification inputrequest=null;
	static String sys_id=null;
	static Response response=null;
	@BeforeMethod
	public void setup() {
		//Endpoint with resources
		RestAssured.baseURI="https://dev128329.service-now.com/api/now/table/";
		RestAssured.authentication=RestAssured.basic("admin", "fhV6YjhR!0A@");
		
		//Construct the request
		inputrequest=RestAssured.given().contentType(ContentType.JSON).log().all();
	
	}
	
	@AfterMethod
	public void teardown() {
		response.then().log().all();
	}

}
