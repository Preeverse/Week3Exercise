package chaining.week3.exercise;

import java.util.Map;

import org.testng.annotations.Test;

public class UpdateRecordPut extends BaseClassImpl{
	@Test(dependsOnMethods= {"chaining.week3.exercise.CreateRecord.testCreateincident"})
	public void testPutIncident() {
		response=inputrequest
				.body("{\"short_description\":\" using put method for hemcrest\"}\r\n"
						+ "")
				.put("change_request/"+sys_id);
		response.then().assertThat().statusCode(200);
	}

}
