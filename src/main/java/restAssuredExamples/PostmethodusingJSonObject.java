package restAssuredExamples;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PostmethodusingJSonObject {
	
	
	/*
	 * @Test public void getJsonData() { RestAssured.baseURI="https://reqres.in";
	 * 
	 * JSONObject obj=new JSONObject(); obj.put("name", "jamesbond");
	 * obj.put("job","detective");
	 * 
	 * given().header("Content-Type","application/json").body(obj.toString()).post(
	 * "/api/users") .then().statusCode(201);
	 * 
	 * }
	 */
	 
	
	 @Test public void empPostmethod() 
	 { 
		 RestAssured.baseURI= "http://localhost:3000";
	  
	  JSONObject obj = new JSONObject();
	  obj.put("id","75");
	  obj.put("empname","dhoni") ; 
	  obj.put("empsalary", "8500");
	  
	  given().header("Content-Type","application/json")
	  
	  .body(obj.toString()).post(
	  "/employee").then().statusCode(201);
	  
	  
	  }
	 
}
