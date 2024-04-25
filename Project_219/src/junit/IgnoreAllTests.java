package junit;

import org.junit.Ignore;
import org.junit.Test;
@Ignore  //Seems class is not fully constructed
public class IgnoreAllTests 
{

	@Test
	public void tc001()
	{
		System.out.println("Test1 Executed");
	}
	
	@Ignore //Only selected test ignore to run
	public void tc002()
	{
		System.out.println("Test2 Executed");
	}
	
	@Test
	public void tc003()
	{
		System.out.println("Test3 Executed");
	}

}
