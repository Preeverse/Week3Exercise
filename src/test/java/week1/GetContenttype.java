package week1;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;
import io.restassured.http.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetContenttype {
	@Test
	public void testGetAllIncidents() {
		//Endpoint with resources
		RestAssured.baseURI="https://dev128329.service-now.com/api/now/table/change_request";
		RestAssured.authentication=RestAssured.basic("admin", "fhV6YjhR!0A@");
		
	
				                          ;
		//Construct a map for multiple Query params
				Map<String,String> queryMap= new HashMap<String,String>();
			
				queryMap.put("category", "Hardware");
				queryMap.put("sysparm_fields","number,sys_id,category");
				//Construct the request single param
				RequestSpecification inputrequest=RestAssured
						                                 .given().accept(ContentType.XML)
						                                 .queryParams(queryMap)
						                                 ;
						                                                  
		
		//Send the request
		Response response = inputrequest.get();
		//Validate the response
		response.prettyPrint();
	}

}
