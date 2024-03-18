package bq.java.conditions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchCase_Statement 
{

	public static void main(String[] args) 
	{
		
		//Mulitple Conditions allowd [Only Check Required case]
		int num=2;
		switch (num) 
		{
		case 1:
			System.out.println("Number1");
			break;
			
		case 2:
			System.out.println("Number2");
			break;
			
		case 3:
			System.out.println("Number3");
			break;

		default:
			System.out.println("number mismatched");
			break;
		}
		
		
		WebDriver driver=null;
		String browser="chrome";
		switch (browser) 
		{
		
		case "chrome":
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			driver=new FirefoxDriver();
			break;
			
		case "edge":
			driver=new EdgeDriver();
			break;

		default:System.out.println("browser name mismatch");
			break;
		}
		
		//Accept Condition only when browser launched without failure
		if(driver!=null)
		{
			driver.get("http://facebook.com");
			
			//Condition accept ony browser title is matched
			if(driver.getTitle().contains("Facebook"))
				System.out.println("title verified");
			else
				System.out.println("title not verified");
		}
		else
			System.out.println("browser initiation failed");

	}

}
