import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateAnIncidentWithQueryParm {
	
	@Test
	public void sendPostRequest() {
		RestAssured.baseURI = "https://dev209228.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "eD9EG/jr%s3M");
		
		Response response = RestAssured.given()
		.contentType(ContentType.JSON) // Mandate for Post and Put
		.accept(ContentType.JSON)
		.queryParam("sysparm_fields", "sys_id, number, category")
		.body("{\r\n"+ "\"category\":\"software\", \r\n"+" \"short_description\":\"Laptop is not working\",\r\n"+" \"description\":\"Laptop issue\" \r\n"+"}")
		.when()
		.post();
		
		response.prettyPrint();
		
	}
}
