package leaveapplication;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import io.restassured.http.ContentType;
import leaveapplication.model.LeaveApply;

import static io.restassured.RestAssured.*;

import java.time.LocalDate;

@SpringBootTest
class LeaveManagementEmployeeApplicationTests {

//	@Test
//	void contextLoads() {
//	}
	
	@Order(1)
	@Test
	void getEmpByEmailId(){
  

		given().header("Content_Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)

		.when()
		.get("http://localhost:9002/leave/emp/nayan@gmail.com")
		.then()
		.assertThat().statusCode(200);

	}
	@Order(2)
	@Test
	void saveLeave()
	{
		
		LeaveApply l= new LeaveApply();
		
		l.setEmailId("ab@gmail.com");
		l.setFromDate(LocalDate.now());
		l.setLeaveReason("from postman");
		l.setLeaveStatus("hello");
		l.setToDate(LocalDate.now());
		l.setMemailId("aravind@gmail.com");
		
		given().header("Content_Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
         .body(l)
		.when()
		.post("http://localhost:9002/leave")
		.then()
		.assertThat().statusCode(201);
		
	}

}
