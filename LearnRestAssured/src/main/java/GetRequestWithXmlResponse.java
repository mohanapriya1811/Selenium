import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetRequestWithXmlResponse {
	@Test
	public void sendGetRequest() {
		
		RestAssured.baseURI = "https://dev209228.service-now.com/api/now/table/incident";
	
		RestAssured.authentication = RestAssured.basic("admin", "eD9EG/jr%s3M");
		
		Response response = RestAssured.given()
				.queryParam("sysparm_fields", "sys_id, number, category")
				.accept(ContentType.XML)
				.when()
				.get();
		
		response.prettyPrint();
		System.out.println(response.xmlPath().get());
	}

}
