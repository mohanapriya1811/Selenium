import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest {
	@Test
	public void sendGetRequest() {
		
		RestAssured.baseURI = "https://dev209228.service-now.com/api/now/table/incident";
	
		RestAssured.authentication = RestAssured.basic("admin", "eD9EG/jr%s3M");
		
		Response response = RestAssured.get();
		
		System.out.println(response.getStatusCode());
		response.prettyPrint();
		
	}

}
