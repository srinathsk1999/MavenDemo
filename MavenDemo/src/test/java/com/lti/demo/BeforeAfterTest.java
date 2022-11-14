package com.lti.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeforeAfterTest {
	
	
	
	Calculator c=new Calculator();
	int sum;
	@BeforeAll
	public static void testDbConn() {
		System.out.println("db is up");
	}
	@BeforeEach
	public void testStartup() {
		sum=500;
		System.out.println("before each");
	}
	
	@Test
	public void testsayHello() {
		
		Assertions.assertEquals("Hello", c.sayHello());
		sum=sum+100;
		System.out.println(sum);
		System.out.println("testhello");
		
	}
	
	@Test
	public void testAddMethod() {
		Assertions.assertEquals(100, c.add(50, 50),"Check the code!");
		sum=sum+200;
		System.out.println(sum);
		
		System.out.println("testadd");
	}

	@Test
	void testAssertFalse() {
		Assertions.assertTrue(10<11);
		Assertions.assertFalse(10>11);
		Assertions.assertNotEquals("hello", "hii");
	}

	@Test
	void testAssertNull() {
		String s1=null;
		
		Assertions.assertNull(s1);

	}
	
	@AfterAll
	public static void testDbClose() {
		System.out.println("close db connection ");
	}
	@AfterEach
	public void testCleanUp() {
		sum=0;
		System.out.println("clean up ");
	}

}