package chaining.week3.exercise;


import org.testng.annotations.Test;

public class DeleteRecord extends BaseClassImpl{
	@Test(dependsOnMethods= {"chaining.week3.exercise.CreateRecord.testCreateincident"})
	public void testDeleteIncident() {
		response=inputrequest.delete("change_request/"+sys_id);
		response.then().assertThat().statusLine("HTTP/1.1 204 No Content");
	}

}
