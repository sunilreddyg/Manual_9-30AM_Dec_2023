package ui_verificationcommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Runtime_Properties 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:--> Verifying Double Seat fares Disabled
		 * 				on roundtrip selection
		 * 
		 * 		Give site url is  http://makemytrip.com
		 * 		When User Select Roundtrip Radio button
		 * 		Then Verify round trip is selected
		 */
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://makemytrip.com");
		Thread.sleep(15000);
		
		WebElement Roundtrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
		Roundtrip.click();
		Thread.sleep(3000);
		
		//Read Runtime Property for Roundtrip object
		String RuntimeClass=Roundtrip.getAttribute("class");
		if(RuntimeClass.contains("selected"))
			System.out.println("Testpass,Roundtrip is selected");
		else
			System.out.println("Testfail,Roundtrip is not selected");
		
		
		/*
		 * Tescase:--> 
		 * 			user selecte student fares radio button
		 * 			Then verify student fares radio button displayed
		 */
		
		WebElement StudentFares=driver.findElement(By.xpath("//ul[@class='specialFareNew']/li[3]"));
		StudentFares.click();
		
		String Reqclass=StudentFares.getAttribute("class");
		if(Reqclass.contains("activeItem"))
			System.out.println("Student fare option is selected");
		else
			System.out.println("Student fare option is not selected");
		
	}

}
