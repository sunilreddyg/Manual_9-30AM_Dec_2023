package capturescreen;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Reusable_CaptureScreen 
{
	WebDriver driver;
	public Reusable_CaptureScreen(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	//Instant method [Reusable method]
	public void capturescreen(String image) 
	{

	    //Captured screen and converted into file format
	    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
	    //Create folder in local system
	    FileHandler.createDir(new File("screens"));
	   
	    //Copty file to local folder
		try {
			FileHandler.copy(src, new File("screens\\"+image+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	   Reusable_CaptureScreen obj=new Reusable_CaptureScreen(driver);
	   obj.capturescreen("FbHomepage");
	   
	   driver.findElement(By.linkText("Messenger")).click();
	   obj.capturescreen("Messenger");

	}

}
