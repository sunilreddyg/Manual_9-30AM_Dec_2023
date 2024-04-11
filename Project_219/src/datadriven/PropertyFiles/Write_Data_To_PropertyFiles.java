package datadriven.PropertyFiles;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Write_Data_To_PropertyFiles {

	public static void main(String[] args) throws IOException {
		
		//Create object for properties
		Properties obj=new Properties();
		
		//Adding objects to porperties
		obj.setProperty("100", "Samsung");
		obj.setProperty("101", "OnePlus");
		obj.setProperty("102", "Vivo");
		obj.setProperty("103", "Nokia");
		
		//Create Output file
		String ifilepath="src\\datadriven\\PropertyFiles\\Output.properties";
		FileOutputStream fo=new FileOutputStream(ifilepath);
		obj.store(fo, "SampleData");
	}

}
