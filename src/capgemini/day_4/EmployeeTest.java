package capgemini.day_4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import capgemini.day_4.java.President;
import capgemini.day_4.java.SalesManager;

class EmployeeTest {

	@Test
	void test() {
		SalesManager manager= new SalesManager("12345","Sandeep Das",10000);
		President president = new President("12345","Sandeep Das",10000,500);
		assertEquals(16500,manager.calculateNetSalary());
		assertEquals(20100, president.calculateNetSalary());
	}

}
