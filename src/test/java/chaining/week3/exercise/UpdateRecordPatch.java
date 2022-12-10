package chaining.week3.exercise;

import java.util.Map;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class UpdateRecordPatch extends BaseClassImpl{
	@Test(dependsOnMethods= {"chaining.week3.exercise.CreateRecord.testCreateincident"})
	public void testPatchIncident() {
		response=inputrequest
				.body("{\"short_description\":\" using patch method for hamcrest\"}\r\n"
						+ "")
				.patch("change_request/"+sys_id);
		response.then().assertThat().body("result.short_description", Matchers.containsString("hamcrest")).statusCode(200);
	}

}
