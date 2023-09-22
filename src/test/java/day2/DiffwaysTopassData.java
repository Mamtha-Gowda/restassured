package day2;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
public class DiffwaysTopassData {
	
	
//	//@Test
//	public void usingMaps() {
//		
//		HashMap data = new HashMap();
//		data.put("name", "dddd");
//		data.put("age", "28");
//		
//		given()
//		.contentType("application/json")
//		.body(data)
//		
//		.when()
//		.post("http://localhost:3000/employees")
//		
//		.then()
//		.statusCode(201)
//		.log().all();
//		
//	}
	
//	@Test
//	public void usingJsonLibrary() {
//		
//		JSONObject data= new JSONObject();
//		data.put("name", "dddd");
//		data.put("age", "28");
//		
//		given()
//		.contentType("application/json")
//		.body(data.toString())
//		
//		.when()
//		.post("http://localhost:3000/employees")
//		
//		.then()
//		.statusCode(201)
//		.log().all();
//		
//	}
	
//	@Test
//	public void pOJO() {
//		
//		POJO data= new POJO();
//		data.setName("dddd");
//		data.setAge("28");
//		
//		given()
//		.contentType("application/json")
//		.body(data)
//		
//		.when()
//		.post("http://localhost:3000/employees")
//		
//		.then()
//		.statusCode(201)
//		.log().all();
//		
//	}
	
	@Test
	public void externalJson() throws FileNotFoundException {
		
		File f = new File(".\\body.json");
		FileReader read =new FileReader(f);
		JSONTokener jk = new JSONTokener(read);
		JSONObject data = new JSONObject(jk);
		
		given()
		.contentType("application/json")
		.body(data.toString())
		
		
		.when()
		.post("http://localhost:3000/employees")
		
		.then()
		.statusCode(201)
		.log().all();
		
	}

}
