package restAssuredExamples;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class PutMethod {

	@Test
	public void putMethod()
	{
	RestAssured.baseURI="http://localhost:3000";
	
	given().header("content-type","application/json").body("{\r\n" + "\"empname\": \"Rajini\",\r\n"
	        + " \"empdalary\":\"9200\" \r\n"
	        		+ "\r\n"
	        + "}")
	.when()
	.put("/employee/50")
	.prettyPrint();
			
	
	
	
}
}