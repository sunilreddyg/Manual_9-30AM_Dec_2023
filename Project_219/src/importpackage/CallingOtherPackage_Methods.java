package importpackage;

import bq.java.constrcutor.Calculator;
import bq.java.methods.Browser;
import bq.java.methods.staticmethods.Mouse;



public class CallingOtherPackage_Methods 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * Calling Otherpackage methods and Variables
		 * Rule1;-->
		 * 			Only public modifier methods and variables 
		 * 			allowed to call outside package
		 * 
		 * Rule2:-->
		 * 			We should write import syntax in current
		 * 			constructed class before calling otherpakage
		 * 			classes and method..
		 * 
		 * 			Syntax:-->
		 * 					import packagename.*;
		 * 					import packagename.Classname;
		 */
		
		Browser obj=new Browser();
		obj.openbrowser();

		Mouse.RightClick();
		
		Calculator obj1=new Calculator(10,20);
		obj1.add();
		
	}

}
