package robot_window_Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement Exp=driver.findElement(By.xpath("//p[contains(.,'I have work experience (excluding internships)')]"));
		Exp.click();
		
		WebElement Upload=driver.findElement(By.xpath("//button[contains(.,'Upload Resume')]"));
		new Actions(driver).click(Upload).perform();
		Thread.sleep(5000);
		
		String path="D:\\Desktop\\MyResume.docx";
		
		
		//Select String
		StringSelection spath=new StringSelection(path);
		//Get System Clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Add Selected string to clipbaord memory
		clipboard.setContents(spath, spath);
		
		//Creating object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		//Pressing Control+V Shortcut
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Press Enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		
		//Releasing Control key [If don't release it will interupt your next run]
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	
	
	
	public static void fileupload(String path)
	{
		//Select String
			StringSelection spath=new StringSelection(path);
			//Get System Clipboard
			Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
			//Add Selected string to clipbaord memory
			clipboard.setContents(spath, spath);
			
			//Creating object for robot class
			Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			robot.setAutoDelay(1000);
			
			//Pressing Control+V Shortcut
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			
			//Press Enter key
			robot.keyPress(KeyEvent.VK_ENTER);
			
			//Releasing Control key [If don't release it will interupt your next run]
			robot.keyRelease(KeyEvent.VK_CONTROL);
	}

}
