package bq.java.Exception_handling;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Catch 
{

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=null;
		try {
			driver=new ChromeDriver();
			driver.get("http://facebook.com");
			driver.findElement(By.id("1email"));
			
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (SessionNotCreatedException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} finally {
			Thread.sleep(5000);
			driver.close();
		}

	}

}
