import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateIncident {

	@Test
	public void createIncident() {
		RestAssured.baseURI = "https://dev209228.service-now.com/api/now/table/incident";
		
		RestAssured.authentication = RestAssured.basic("admin", "eD9EG/jr%s3M");
		
		Response response = RestAssured.given().queryParam("category", "software").contentType(ContentType.JSON)
				.accept(ContentType.JSON).when().post();
		
		System.out.println(response.statusCode());
		response.prettyPrint();
		
		
	}
}
