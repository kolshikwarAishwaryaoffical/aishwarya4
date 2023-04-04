package com.example.profile;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.profile.model.Employee;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

@SpringBootTest
class EditViewEmployeeApplicationTests {

	@Order(1)
	@Test
	void getALLEmployee() {


		given().header("Content_Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)

		.when()
		.get("http://localhost:8086/view/abc@gmail.com")
		.then()
		.assertThat().statusCode(200);

	}

	@Order(2)
	@Test
	void editemployee() {
		Employee e= new Employee();
		e.setFirstName("Asadsqdqwede");
		e.setLastName("Kolshikdsadafdwar");
		e.setAddress("H.no-23");
		e.setCity("Bns");
		e.setCountry("India");
		e.setPassword("Emp@2023");
		e.setState("TS");

		given().header("Content_Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
		.body(e)
		.when()
		.put("http://localhost:8086/view/put/ab@gmail.com")
		.then()
		.assertThat().statusCode(200);

	}

}
