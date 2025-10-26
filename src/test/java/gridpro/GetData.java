package API;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetData {

	@Test
	public void getData()
	{
		given()
		.queryParam("from","KIX")
		.queryParam("to", "NRT")
		.when().
		post("https://airportgap.com/api/airports/distance")
		.then().assertThat().log().all();
	}
}
