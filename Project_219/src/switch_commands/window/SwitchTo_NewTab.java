package switch_commands.window;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_NewTab 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    //get Current window ID
	    String MainWindowID=driver.getWindowHandle();
	    
	    //Only Selenium 4 have this feature...
	    WebDriver insta=driver.switchTo().newWindow(WindowType.TAB);
	    insta.get("https://www.instagram.com/");
	    
	    
	    System.out.println(insta.getTitle());
	    
	    //Switching back to main window
	    insta.switchTo().window(MainWindowID);
	    System.out.println(driver.getTitle());
	    

	}

}
