package findElements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Elements {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Target Single Dropdown 
		WebElement StateDrodpown=driver.findElement(By.id("customState"));
		
		//IDentifying group of objects under selected element
		List<WebElement> AllStates=StateDrodpown.findElements(By.tagName("option"));
		
		if(AllStates.size() > 0)
		{
			//Remove First object
			AllStates.remove(0);
			
			//Applying foreach loop  to read next objects from collection
			for (WebElement EachState : AllStates) 
			{
				EachState.click();
				Thread.sleep(500);
			}
			
		}
		
		
	}

}
