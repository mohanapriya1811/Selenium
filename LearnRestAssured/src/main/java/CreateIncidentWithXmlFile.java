import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateIncidentWithXmlFile {

	@Test
	public void sendPostWithFile() {
		
		RestAssured.baseURI = "https://dev209228.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "eD9EG/jr%s3M");
		
		
		Response response = RestAssured.given()
		.contentType(ContentType.XML)
		.accept(ContentType.JSON)
		.queryParam("sysparm_fields", "sys_id, number, category")
		.body(new File("./src/main/resources/xml"))
		.when()
		.post();
		
		//System.out.println(response.jsonPath().get("response.result.category").toString());
		response.prettyPrint();
		System.out.println(response.getStatusCode());
		
	}
}
