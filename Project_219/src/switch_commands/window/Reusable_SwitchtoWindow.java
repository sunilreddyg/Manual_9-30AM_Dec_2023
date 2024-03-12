package switch_commands.window;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reusable_SwitchtoWindow 
{
	
	static WebDriver driver;
	public static void switchtowindow(String title)
	{
		//Get All window handles
	    Set<String> AllwindowIds=driver.getWindowHandles();
	    //set release window id's in random order
	    for (String Eachwindow : AllwindowIds) 
	    {
	    		String PageTitle=driver.switchTo().window(Eachwindow).getTitle();
	    		if(PageTitle.contains(title))
	    		{
	    			break;  //Jump Command
	    		}
		}
	}

	public static void main(String[] args) throws Exception 
	{
		
		
		driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    //This link will open extra window
	    WebElement Meta=driver.findElement(By.linkText("Meta"));
	    Meta.click();
	    Thread.sleep(5000);
	    
	    switchtowindow("Meta");
	    System.out.println(driver.getTitle());
	    
	}

}
