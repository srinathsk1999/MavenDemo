package com.lti.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTests {
	Calculator c=new Calculator();
	@Disabled
    @Test
	public void testsayHello()
	{
		Assertions.assertEquals("hello", c.sayHello());
	}
	
    @Test
    public void testadd() {
        Assertions.assertEquals(100,c.add(60,40),"check the code again");
    }
	
    @Test
    void testAssertFalse()
    {
    	Assertions.assertTrue("sri".length()==3);
    	Assertions.assertFalse("sri".length()==10);
    	Assertions.assertNotEquals("hello","Hello");
    }
	@Disabled
    @Test
    void testAssertNull()
    {
    	String str1=null;
    	String str2="abc";
    	Assertions.assertNull(str1);
    	Assertions.assertNotNull(str2);
    	
    }
	
}
