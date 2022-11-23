package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testcasee {

	@Test
	public void testAdd() {
		Test123 t = new Test123() ; 
		int actual = t.add(1234,5678);
		assertEquals(6912,actual);
		
		//fail("Not yet implemented");
		
	}

	@Test
	public void testMul() {
		Test123 t = new Test123() ; 
		int actual = t.mul(1234, 5678);
		assertEquals(7006652,actual);
		//fail("Not yet implemented");
	}

}
