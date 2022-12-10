package chaining.week3.jiraexercise;

import java.io.File;

import org.testng.annotations.Test;

public class CreateJIRAid extends BaseClassImpl {
@Test	
public void testCreateid() {
	File dataFileJIRA=new File("./src/test/resources/JIRADataFile.json");
	response=inputrequest.body(dataFileJIRA).post("issue");
	G_id=response.jsonPath().get("id");
    response.then().assertThat().statusCode(201);	
}
	
	
	
}
