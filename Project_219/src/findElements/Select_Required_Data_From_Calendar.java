package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Required_Data_From_Calendar {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
		driver.manage().window().maximize();
		
		
		//Click on Calendar
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		Thread.sleep(2000);
		
		String Exp_month="December 2024";
		String Exp_Date="15";
		
		
		while(true)
		{
			WebElement MonthLoc=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			String ActMonth=MonthLoc.getText();
			
			if(ActMonth.equals(Exp_month))
			{
				driver.findElement(By.linkText(Exp_Date)).click();
				System.out.println("Date selected");
				break;
			}
			
			
			WebElement NextBtn=driver.findElement(By.xpath("//span[contains(.,'Next')]"));
			NextBtn.click();
			Thread.sleep(2000);
		}
		
		
		
	}
}
