package datadriven.PropertyFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Read_PropertyFiles_Data 
{

	public static void main(String[] args) throws IOException 
	{
		String filepath="src\\datadriven\\PropertyFiles\\Input.properties";
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("File Located");
		
		//Creating object for property files
		Properties repository=new Properties();
		repository.load(fi);
		
		
		WebDriver driver = null;
		String browser=repository.getProperty("browser");
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		//loading page
		String url=repository.getProperty("HRM.url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//Reading username and password from property files
		String UID=repository.getProperty("username");
		String PWD=repository.getProperty("password");
		
		
		driver.findElement(By.name("username")).sendKeys(UID);
		driver.findElement(By.name("password")).sendKeys(PWD);
		

	}

}
