package webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selection_Methods {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		
		//Selecting dropdown option using VisibleText
		WebElement DOBday=driver.findElement(By.name("birthday_day"));
		new Select(DOBday).selectByVisibleText("10");
		
		
		//Selecting dropdown option using  value property
		WebElement DOBmonth=driver.findElement(By.name("birthday_month"));
		new Select(DOBmonth).selectByValue("10");
		
		//selecting dropdown option using index number
		WebElement DOByear=driver.findElement(By.id("year"));
		new Select(DOByear).selectByIndex(20);
		

	}

}
