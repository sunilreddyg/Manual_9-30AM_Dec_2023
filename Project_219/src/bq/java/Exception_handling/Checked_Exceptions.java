package bq.java.Exception_handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.IOException;

public class Checked_Exceptions {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
		
		System.out.println("Statement1");
		Thread.sleep(5000);
		System.out.println("Statement2");
		
		FileInputStream  file=new FileInputStream("Data");
		
		Robot robot=new Robot();
		
		
		

	}

}
