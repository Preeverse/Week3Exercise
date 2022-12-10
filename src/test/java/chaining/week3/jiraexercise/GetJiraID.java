package chaining.week3.jiraexercise;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class GetJiraID extends BaseClassImpl{
	@Test
	public void getJira() {
		response=inputrequest.get("issue/10029");
		response.then().assertThat().body("key", Matchers.containsString("FIN")).statusCode(200);			
		}

}
