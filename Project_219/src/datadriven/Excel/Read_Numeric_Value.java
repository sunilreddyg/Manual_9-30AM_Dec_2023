package datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Numeric_Value {

	public static void main(String[] args) throws Exception {
		
		//Target file from local system
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Workbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using book reference
		XSSFSheet sht=book.getSheet("celldata");
		
		//Target using sheet Reference
		XSSFRow row=sht.getRow(1);
		
		//GetNumricCellvalue method by default read numer into double format
		Double dvalue=row.getCell(1).getNumericCellValue();
		
		
		//Expected Data
		String ExpPrice="25000";
		//Converting double format into string value
		String ActPrice=NumberToTextConverter.toText(dvalue);
		
		
		//Verify Two String are equal
		if(ExpPrice.equals(ActPrice))
			System.out.println("Price is equal");
		else
			System.out.println("price is not equal");
		
		
	}

}
