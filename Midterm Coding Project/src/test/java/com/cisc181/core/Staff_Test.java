package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {


	private static final Date Date = new Date();
	private static final eTitle Title = eTitle.MR;
	static ArrayList<Staff> salaries;
	double actualAvg;
	



	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		int sum = 0;
		salaries = new ArrayList<Staff>();
		int[] payRoll =  {75873,43432,194233, 47302,745037};
		
		
		for(int x : payRoll){
			Staff member = new Staff("x", "x", "x",Date, "x", "(302)-555-3929", "x","x", 0, x, Date, Title);
			salaries.add(member);
			sum = sum + x;
		}
	
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
	
		
		}
	
		
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
	}
	
		
		
	@SuppressWarnings("deprecation")
	@Test
	public void testSalary() {
		ArrayList<Double> average = new ArrayList<Double>();
		for (Staff i: salaries){
			double pay = i.getSalary();
			average.add(pay);
		}
		
		double sum = 0;
		for(double i: average){
			sum=sum+i;
		}
		double testAvg = sum/5;
		double actualAvg =(75873+43432+194233+47302+745037)/5;		
		
		assertEquals(actualAvg, testAvg, .5);
		
	}	




@Test(expected = PersonException.class)
public void testPersonException() throws PersonException {
	Staff member = new Staff("x", "x", "x",Date, "x", "x", "x","x", 0, 0, Date,Title);
	member.setPhone("249");
		
}
@Test(expected = PersonException.class)
public void testPersonException2() throws PersonException {
	
	Date invalidDate = new GregorianCalendar(1857,7,22,0,0,0).getTime();

	Staff member = new Staff("x", "x", "x",invalidDate, "x", "x", "x","x", 0, 0, Date,Title);
}

}
