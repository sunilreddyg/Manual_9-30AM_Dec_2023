package switch_commands.window;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwitchTo_Next_Window 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	    //This link will open extra window
	    WebElement Meta=driver.findElement(By.linkText("Meta"));
	    Meta.click();
	    Thread.sleep(5000);
	    
	    
	    //Get all window ID's
	    Set<String> allwindowids=driver.getWindowHandles();
	    
	    //Collection data converting into iterator class
	    Iterator<String> itr=allwindowids.iterator();
	    
	    //Reading each iterator using next keyword
	    String Win1=itr.next();
	    String Win2=itr.next();
	    
	    
	    System.out.println("Before Switch --> "+driver.getTitle());
	    driver.switchTo().window(Win2);
	    System.out.println("After Switch --> "+driver.getTitle());
	    driver.switchTo().window(Win1);
	    System.out.println("MainWindow Title is :-->"+driver.getTitle());
	    
	    
	    /*
	     * Note:--> Only use this program when two windows are opened.
	     * 			[
	     * 				Because Set is  a unorder collection of obejcts
	     * 				it change it's order when more than two iterations 
	     * 				available 
	     * 			]
	     */
	}

}
