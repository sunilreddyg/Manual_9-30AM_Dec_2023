package capturescreen;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_Screen {

	public static void main(String[] args) throws IOException  {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	    
	    //Captured screen and converted into file format
	    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
	    //Create folder in local system
	    FileHandler.createDir(new File("screens"));
	   
	    //Copty file to local folder
	    FileHandler.copy(src, new File("screens\\image.png"));
	    
	    
	    
	}
	
	
	
	

}
