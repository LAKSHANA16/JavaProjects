package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestApp
{
	
@BeforeClass
public static void beforeclass() {//static
	System.out.println("Before Class");
}
@Before
public void before()
{
	System.out.println("Before");
}
@Test
public void test1()
{
	System.out.println("Test 1");
}
@Test
public void test2()
{
	System.out.println("Test 2");
}
@After
public void after()
{
	System.out.println("AFTER");
}
@AfterClass
public static void afterclass()//static
{
	System.out.println("AFTER CLASS");
}
}