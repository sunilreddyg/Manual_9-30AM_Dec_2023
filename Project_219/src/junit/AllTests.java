package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses
		(
				{ 
					IgnoreAllTests.class, 
					Junit_Assertions.class
				}
		)
public class AllTests 
{

}
