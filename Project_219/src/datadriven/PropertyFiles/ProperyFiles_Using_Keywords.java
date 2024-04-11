package datadriven.PropertyFiles;

public class ProperyFiles_Using_Keywords 
{
	
	public static void main(String[] args) 
	{
		
		
		String UID=Read_propertyFiles.getProperty("username");
		String PWD=Read_propertyFiles.getProperty("password");
		System.out.println(UID+"  "+PWD);
	}

}
