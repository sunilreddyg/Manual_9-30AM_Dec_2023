package switch_commands.window;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_SecondWindow 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    //Capture mainwindow id
	    String Mainwindow=driver.getWindowHandle();
	    
	   
	    //This link will open extra window
	    WebElement Meta=driver.findElement(By.linkText("Meta"));
	    Meta.click();
	    Thread.sleep(5000);
	    
	    //get All Window ID's 
	    Set<String> AllWindowIds=driver.getWindowHandles();
	    
	    //Applying foreach loop to iterator number of window times
	    for (String eachwindowid : AllWindowIds) 
	    {
			driver.switchTo().window(eachwindowid);
		}
	    
	    
	    //Here is assumption when iteration stops, By default
	    //window controls will be presented at Second window
	    System.out.println("Second window title is :-->"+driver.getTitle());
	    
	    
	    //Switch to mainwindow
	    driver.switchTo().window(Mainwindow);
	    System.out.println("Main window title is :-->"+driver.getTitle());
	}

}
