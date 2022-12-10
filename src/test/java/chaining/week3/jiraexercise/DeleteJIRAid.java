package chaining.week3.jiraexercise;

import org.testng.annotations.Test;

public class DeleteJIRAid extends BaseClassImpl{
@Test(dependsOnMethods= {"chaining.week3.jiraexercise.CreateJIRAid.testCreateid"})
public void deleteJIRA() {
	response=inputrequest.delete("issue/"+G_id);
	response.then().assertThat().statusCode(204).statusLine("HTTP/1.1 204 No Content");
}
}
