package chaining;

import java.util.Map;

import org.testng.annotations.Test;

public class DeleteRecord extends BaseClassImpl{
	@Test(dependsOnMethods= {"chaining.CreateRecord.testCreateincident"})
	public void testDeleteIncident() {
		response=inputrequest.delete("incident/"+sys_id);
		response.then().assertThat().statusCode(204);
	}

}
