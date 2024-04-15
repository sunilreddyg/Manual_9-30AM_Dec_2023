package datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_MultipleRows {

	public static void main(String[] args) throws IOException {
		
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData//InputData.xlsx");
		System.out.println("File located");
		
		//Get Workbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above workbook
		XSSFSheet sht=book.getSheetAt(2);
		
	    //Reading index number at what row exactly data started
		int start=sht.getFirstRowNum();
		//Reading index number at what row exacly data ends.
		int end=sht.getLastRowNum();
		
		
		
		for (int i = start; i <= end; i++) 
		{
			
			String UID=sht.getRow(i).getCell(0).getStringCellValue();
			String PWD=sht.getRow(i).getCell(1).getStringCellValue();
			System.out.println(UID+"   "+PWD);
			
		}
		

	}

}
