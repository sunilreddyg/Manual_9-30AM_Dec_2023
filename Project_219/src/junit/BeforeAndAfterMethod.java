package junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeforeAndAfterMethod 
{
	
	

	@BeforeEach  //Invoke every @Test method before
	void setUp() throws Exception 
	{
		System.out.println("before test");
	}

	@AfterEach //Invoke every @Test method after
	void tearDown() throws Exception 
	{
		System.out.println("after test");
	}

	@Test
	void test1() 
	{
		System.out.println("Test1 Run Executed");
	}
	
	@Test
	void test2() 
	{
		System.out.println("Test2 Run Executed");
	}
	
	@Test
	void test3() 
	{
		System.out.println("Test3 Run Executed");
	}



}
