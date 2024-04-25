package junit;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BeforeAndAfterClass 
{
	
	@AfterAll //Invoke after last @Test with in class
	static void tearDownAfterClass() throws Exception 
	{
		System.out.println("Class PostCondition");
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

	
	@BeforeAll //Invoke before first @Test with in class
	static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Class Precondition");
	}


}
