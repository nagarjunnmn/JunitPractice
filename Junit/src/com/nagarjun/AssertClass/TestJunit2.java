package com.nagarjun.AssertClass;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TestJunit2 extends TestCase{

	protected double fValue1;
	protected double fValue2;
	
	@Before
	public void setUp(){
		fValue1=2.0;
		fValue2=3.0;
	}
	
	@Test
	public void testAdd(){
		System.out.println("No of test case: "+this.countTestCases());
		
		String name = this.getName();
		System.out.println("Test case name: "+name);
		this.setName("testNewAdd");
		String newName = this.getName();
		
		System.out.println("Updated test case Name: "+newName);
	}
	
	public void tearDown(){
		
	}
}
