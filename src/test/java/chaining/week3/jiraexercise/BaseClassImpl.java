package chaining.week3.jiraexercise;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClassImpl {
	static RequestSpecification inputrequest=null;
	static String G_id=null;
	static Response response=null;
	
	@BeforeMethod
	public void setup() {
		RestAssured.baseURI="https://preethaapi91.atlassian.net/rest/api/2";
		RestAssured.authentication=RestAssured.preemptive().basic("preethapr91@gmail.com", "ChulnWB4eEY21WMOq0iK97E6");
		inputrequest=RestAssured.given().contentType(ContentType.JSON).log().all();
		
	}
	
	@AfterMethod
	public void teardown() {
		response.then().log().all();
	}

}
