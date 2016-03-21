/**
 * 
 */
package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Dad
 *
 */
public class Employee_Test {
	
	 Employee amy;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
		
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		Date DOB = (new GregorianCalendar(1972,8,19,16,24,12)).getTime();
		Date hire = new GregorianCalendar(2011,5,13,1,1,1).getTime();
		amy = new Employee("Amy","L", "Quinn", DOB,"22 center street", "(302)-555-6789", "aquinn@udel.edu","112 sharp lab", 125000,hire);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		amy=null;
	}

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		assertTrue(amy instanceof Employee);
		assertEquals("112 sharp lab",amy.getOffice());
		assertNotNull(amy.getHire());
		assertEquals(125000,amy.getSalary());
	}

}
