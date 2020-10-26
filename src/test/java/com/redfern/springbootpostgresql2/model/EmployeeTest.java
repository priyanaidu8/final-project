package com.redfern.springbootpostgresql2.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeeTest {
	
	protected static Employee felix;
	protected static String fname = "Felix";
	protected static String lname = "D'Cat";
	protected static String email = "felixrox@aol.com";
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		felix = new Employee(fname, lname, email);
	}

	@Test
	@Order(1)
	// method_GivenParameters_ShouldReturn()
	void employee_GivenThreeParameters_ShouldConstructEmployee() {
		assertTrue(felix instanceof Employee);
		assertEquals(0, felix.getId());
		assertEquals(fname, felix.getFirstName());
		assertEquals(lname, felix.getLastName());
		assertEquals(email, felix.getEmail());
	}
	
	@Test
	@Order(2)
	void setId_GivenLong_ShouldSetId() {
		felix.setId(100);
		assertEquals(100, felix.getId());
	}
}
