package com.example.loginemployee;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.context.annotation.Configuration;

import com.example.loginemployee.model.AuthenticationRequest;

//import groovyjarjarasm.asm.commons.Method;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import static io.restassured.RestAssured.*;



//@SuppressWarnings("unused")
//@Configuration
@SpringBootTest
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
 class LoginEmployeeApplicationTests {	
	
	@Test	
    void LoginTest() {
		AuthenticationRequest authCheck = new AuthenticationRequest();
		authCheck.setEmailId("aishwaryakolshikwar27@gmail.com");
		authCheck.setPassword("Emp@2023");
		
		 given().header("Content_Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
		.body(authCheck)
		.when()
		.post("http://localhost:8089/authenticate")
		.then()
		.assertThat().statusCode(200);
		
		
		
	}

}
