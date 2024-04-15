package datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Cell {

	public static void main(String[] args) throws IOException {
		
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData//InputData.xlsx");
		System.out.println("File located");
		
		//Get Workbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above workbook
		XSSFSheet sht=book.getSheetAt(1);
		
		//Get row usign above sheet
		XSSFRow row=sht.getRow(1);
		
		
		//Reading string cell data
		String String=row.getCell(0).getStringCellValue();
		System.out.println(String);
		
		//Reading Numeric Cell data
		double dble=row.getCell(1).getNumericCellValue();
		System.out.println(dble);
		
		//Reading boolean cell data
		boolean bln=row.getCell(2).getBooleanCellValue();
		System.out.println(bln);
		
		//Reading Data cell data
		Date date=row.getCell(3).getDateCellValue();
		System.out.println(date);
		
		
		/*
		 * Exception:-->
		 * 				IllegalStateException:-->
		 * 					
		 * 				for Example:-->
		 * 					for suppose data availbale in string format
		 * 					and user attempt to read data from numeric command
		 */

	}

}
