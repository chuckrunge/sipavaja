package com.cgrunge;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;

public class ValidationErrorTest {

	boolean result = true;
	String sz = "";	
	static validationError ve = null;
	int iNbr = 0;
	String sBar = "szszsz";
	Integer iBar = 0;
	Float fBar = 0f;
	Double dBar = 0.0;
	List<String> list = new ArrayList<String>();
	Map<String,String> map = new HashMap<String,String>();
	Set<String> set = new HashSet<String>();
	Date foo = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		ve = new validationError();

	}

	@Test
	public void testOne() {

		assertTrue(ve.validation(iNbr));

	}

	@Test
	public void testTwo() {

		assertTrue(ve.validation(iNbr, sBar));

	}

	@Test
	public void testThree() {

		assertTrue(ve.validation(iNbr, sBar, iBar));

	}
	@Test
	public void testFour() {

		assertTrue(ve.validation(iNbr, sBar, iBar, fBar));

	}

	@Test
	public void testFive() {

		assertTrue(ve.validation(iNbr, sBar, iBar, fBar, dBar));

	}

	@Test
	public void testSix() {

		assertFalse(ve.validation(iNbr, sBar, iBar, fBar, dBar, list));

	}

	@Test
	public void testSeven() {

		assertFalse(ve.validation(iNbr, sBar, iBar, fBar, dBar, list, map));

	}

	@Test
	public void testEight() {

		assertFalse(ve.validation(iNbr, sBar, iBar, fBar, dBar, list, map, set));

	}

	@Test
	public void testNine() {

		assertFalse(ve.validation(iNbr, sBar, iBar, fBar, dBar, list, map, set, foo));

	}

}
