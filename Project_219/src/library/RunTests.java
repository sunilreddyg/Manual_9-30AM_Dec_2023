package library;



import org.junit.jupiter.api.Test;

class RunTests extends CommonActions
{

	@Test
	void test() 
	{
		setupchrome();
		typetext(CommonObjects.email, "Darshan");
		ClickonElement(CommonObjects.Singuplink);
		selectdropdownoption(CommonObjects.reg_dob_day, "24");
	}

}
