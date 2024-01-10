package day1RestAssured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;


public class PutRequest {

	@Test
	void createUser1() {

		HashMap data = new HashMap();
		data.put("name", "pavan");
		data.put("job", "trainer");

		
				given().contentType("application/json").body(data)
				.when().post("https://reqres.in/api/users")
				.then().statusCode(201).log().all();

}
	
}
