package main.base;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;

public class baseAPI {
	private RestAssured client;
	private RequestSpecBuilder requestBuilder;
	
	public RestAssured restClient() {
		if(client==null) {
			client = new RestAssured();
		}
		return client;
	}
	
	public RequestSpecBuilder builder(){
		if(requestBuilder==null) {
			requestBuilder = new RequestSpecBuilder();
		}
		return requestBuilder;
	}
}
