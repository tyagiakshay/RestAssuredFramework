package main.base;
import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.security.KeyStore;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.Filter;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import io.restassured.specification.AuthenticationSpecification;
import io.restassured.specification.MultiPartSpecification;
import io.restassured.specification.ProxySpecification;
import io.restassured.specification.RedirectSpecification;
import io.restassured.specification.RequestLogSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
public class apiMethods {

	private baseAPI base;
	private RequestSpecification requestSpec;
	
	private apiMethods(baseAPI base) 
	{
		this.base = base;
	}
	
	public RequestSpecification request() 
	{
		base.restClient();
		requestSpec = RestAssured.given();
		return requestSpec;
	}
	
	public Response getAPI() {		
		return requestSpec.request().get();
	}
	
	public Response postAPI() {		
		return requestSpec.request().post();
	}
	
	public Response putAPI() {		
		return requestSpec.request().put();
	}
	
	public Response deleteAPI() {		
		return requestSpec.request().delete();
	}
}
