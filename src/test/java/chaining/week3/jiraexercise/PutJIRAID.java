package chaining.week3.jiraexercise;

import java.io.File;

import org.testng.annotations.Test;

public class PutJIRAID extends BaseClassImpl{

	@Test(dependsOnMethods= {"chaining.week3.jiraexercise.CreateJIRAid.testCreateid"})
	public void editJIRA() {
		File file=new File("./src/test/resources/PatchJIRADataFile.json");
		response=inputrequest.body(file).put("issue/"+G_id);
		response.then().assertThat().statusCode(204);
	}
}
