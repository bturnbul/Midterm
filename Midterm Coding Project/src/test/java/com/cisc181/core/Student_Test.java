package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		Course physics = new Course("Physics",100);
		Course english = new Course("English",100);
		Course math = new Course("Math",100);
		
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}