package ui_verificationcommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Option_Presented {

	public static void main(String[] args) throws Exception {
		

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Selecting Dropdown option
		new Select(driver.findElement(By.xpath("//select[@id='customState']")))
		.selectByVisibleText("Gujarat");
		Thread.sleep(4000);
		
		boolean flag=false;
		try {
			//Identify City Dropdown location
			WebElement CityDropdown=driver.findElement(By.xpath("//select[@id='customCity']"));
			new Select(CityDropdown).selectByVisibleText("Baroda");	
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(flag==true)
			System.out.println("Required Options Presented at drodpown");
		else
			System.out.println("Required options not presented at dropdown");
	}

}
