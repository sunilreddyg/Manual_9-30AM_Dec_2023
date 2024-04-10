package findElements.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Required_Row_From_DynamicRows {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://finance.yahoo.com/quote/%5ENSEI/history/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		
		WebElement table=driver.findElement(By.xpath("//table[@data-test='historical-prices']"));
		
		//Finding list of rows available under table
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		rows.remove(0);   //Removing header row
		
		for (int i = 1; i <= rows.size(); i++) 
		{
			//Selecting 3rd index row
			WebElement SelectedRow=rows.get(i);
			
			//Read Row Text
				if(SelectedRow.getText().contains("Mar 18, 2024"))
				{
					//Finding list of cells under selected row
					List<WebElement> cells=SelectedRow.findElements(By.tagName("td"));
					
					String Date=cells.get(0).getText();
					String Price=cells.get(1).getText();
					String LowPrice=cells.get(4).getText();
					
					System.out.println(Date+"  "+Price+"  "+LowPrice);
					break;
				}
				
			
			
		}
		

	}

}
