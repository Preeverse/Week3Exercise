package chaining;

import java.util.Map;

import org.testng.annotations.Test;

public class CreateRecord extends BaseClassImpl{
	@Test
	public void testCreateincident() {
		response=inputrequest.post("incident");
		sys_id=response.jsonPath().get("result.sys_id");
		response.then().assertThat().statusCode(201);
	}

}
