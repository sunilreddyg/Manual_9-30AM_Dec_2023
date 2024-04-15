package datadriven.Excel.Keywords;

import java.util.List;

public class ReadExcelData_Using_Keywords 
{

	public static void main(String[] args) 
	{
		
			Excel.getexcel("InputData.xlsx", "multiple");
			
			String UID=Excel.getCellData(1, 0);
			System.out.println(UID);
			
		
			
			//Read Excel Data
			List<List<String>> data=Excel.readExcel("TestData\\InputData.xlsx", "multiple");
			List<String> row=data.get(1);   //Ist row Data
		    String cell=row.get(0);
		    System.out.println(cell);

	}

}
