package chaining.week3.exercise;

import java.util.Map;

import org.testng.annotations.Test;

public class CreateRecord extends BaseClassImpl{
	@Test
	public void testCreateincident() {
		response=inputrequest
				.body("{\"short_description\":\"hello\",\r\n"
                 		+ "\"description\":\"hello world\"}\r\n"
                 		+ "")
				.post("change_request");
		sys_id=response.jsonPath().get("result.sys_id");
		System.out.println("Created Sysid: +++++++++++"+sys_id);
		response.then().assertThat().statusCode(201);
	}

}
