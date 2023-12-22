import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestWithQueryParam {
	
	@Test
	public void getRequestWithParm() {
		RestAssured.baseURI = "https://dev209228.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "eD9EG/jr%s3M");
		
		
		Map<String, String> map = new HashMap<>();
		
		map.put("category", "software");
		map.put("sysparm_fields", "sys_id, number, category");
		
		Response response = RestAssured.given().queryParams(map).when().get();
		/*
		 * Response response = RestAssured.given().queryParam("category", "Software")
		 * .queryParam("sysparm_fields", "category, sys_id").when().get();
		 */
		
		response.prettyPrint();
		
		List<String> allCategory = response.jsonPath().getList("result.category");
		
		
		System.out.println(response.getStatusCode());
		System.out.println(allCategory);
		
	}
}
