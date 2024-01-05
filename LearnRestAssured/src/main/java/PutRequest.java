import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PutRequest {

	@Test
	public void sendPutRequest() {
		
		RestAssured.baseURI = "https://dev209228.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "eD9EG/jr%s3M");
		
		Response response = RestAssured.given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.queryParam("sysparm_fields", "sys_id, number, category")
		.body("{\r\n" + "\"category\":\"software\" \r\n" +"}")
		.when()
		.put("812f5b1093df3110b61273118bba10a9");
		System.out.println(response.jsonPath().get("result.category").toString());
		response.prettyPrint();

	}
}
