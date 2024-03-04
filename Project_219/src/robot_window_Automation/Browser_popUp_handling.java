package robot_window_Automation;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_popUp_handling {

	public static void main(String[] args) throws Exception 
	{
		
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.irctc.co.in/nget/train-search");
		   driver.manage().window().maximize();
		   Thread.sleep(5000);
		   
		   
		   Robot robot=new Robot();
		   robot.setAutoDelay(1000);
		   
		   robot.mouseMove(300, 166);
		   
		   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		   robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		   
		  
		 
	}
	
	public static void RobotLeftMouseClick(int X, int Y) throws Exception
	{
		   Robot robot=new Robot();
		   robot.setAutoDelay(1000);
		   //Move Cursor to Required Location
		   robot.mouseMove(X,Y);
		 
		   //Press Mouse left click
		   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		   robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);   
	}

}
