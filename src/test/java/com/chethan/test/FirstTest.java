package com.chethan.test;

import org.testng.annotations.Test;

public class FirstTest {
	
	@Test
	public void t1()
	{
		System.out.println(" execitong test1");
		System.out.println("value fetched from "+System.getProperty("propertyName"));
	}
	@Test
	public void t2()
	{
		System.out.println(" execitong test2");
	}
	

}
