package findElements;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupLinks_With_StateElement_Exception {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		
		WebElement MenuTabs_location=driver.findElement(By.xpath("(//div[@class='_3noxt'])[1]"));
		List<WebElement> Tabs=MenuTabs_location.findElements(By.xpath("//div[@class='_2EGQY cqA0P']"));
		System.out.println(Tabs.size());
		
		for (int i=0; i < 4; i++) 
		{
			
			Tabs.get(i).click();
			Thread.sleep(3000);
			
			
			String exptitle[]=
					{
								"Online Recharge - Online Mobile Recharge & Prepaid Recharge Plans",
								"Electricity Bill Payment - Pay Electricity Bill Online | Light Bill",
								"DTH Recharge - Online DTH Recharge Offers | Digital Tv Recharge",
								"Gas Booking - Online Gas Cylinder Booking & Payment at Paytm.com",
					};
			
			if(driver.getTitle().equals(exptitle[i]))
			{
				System.out.println(" ==> Title Verifed");
			}
			else
			{
				System.out.println(" ==> Title not Verifed");
			}
			
			driver.navigate().back();  //Refresh Page once
			Thread.sleep(2000);
			
			//Restore all identifications to avoid staleElementException
			 MenuTabs_location=driver.findElement(By.xpath("(//div[@class='_3noxt'])[1]"));
			 Tabs=MenuTabs_location.findElements(By.xpath("//div[@class='_2EGQY cqA0P']"));
			
		}
		

	}

}
