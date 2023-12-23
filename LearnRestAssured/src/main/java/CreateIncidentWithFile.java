import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateIncidentWithFile {

	@Test
	public void sendPostWithFile() {
		
		RestAssured.baseURI = "https://dev209228.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "eD9EG/jr%s3M");
		
		
		Response response = RestAssured.given()
		.contentType(ContentType.JSON)
		.accept(ContentType.XML)
		.queryParam("sysparm_fields", "sys_id, number, category")
		.body(new File("./src/main/resources/CreateIncident.json"))
		.when()
		.post();
		
		System.out.println(response.xmlPath().get("response.result.category").toString());
		response.prettyPrint();
		
	}
}
