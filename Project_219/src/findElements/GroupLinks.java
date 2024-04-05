package findElements;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GroupLinks {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");   
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		
		WebElement TrendingList=driver.findElement(By.xpath("//div[@id='trending-naukri-wdgt']"));
		//Finding group elements under Selected element
		List<WebElement> AllTabs=TrendingList.findElements(By.className("ntc__chip-wrapper"));


		//Get main window id
		String Mainwindow=driver.getWindowHandle();
		for (int i = 0; i < AllTabs.size(); i++) 
		{
			//Target Each tab
			WebElement EachTab=AllTabs.get(i);
			new Actions(driver).scrollToElement(EachTab).perform();
			
			//Reading each tab   Text and Href properties
			String TabName=EachTab.getText();
			String TabHref=EachTab.getAttribute("href");
			
			//Click on each tab
			EachTab.click();
			Thread.sleep(2000);
			

			//switch to second window..
			Set<String> Allwindows=driver.getWindowHandles();
			for (String Eachwindow : Allwindows) 
			{
				driver.switchTo().window(Eachwindow);
			}
			//Here assumption is after loop finished controls will be avaialbel at second window
			
			//Get Current url
			String ActUrl=driver.getCurrentUrl();
			if(driver.getCurrentUrl().contains(TabHref))
			{
				System.out.println(TabName+"--->Url Verified");
			}
			else
			{
				System.out.println(TabName+"  ---> Url mismatched  ");
			}
			
			//Close sigle window
			driver.close();
			
			//Switch back to mainwidow
			driver.switchTo().window(Mainwindow);
		}
		
		
	}

}
