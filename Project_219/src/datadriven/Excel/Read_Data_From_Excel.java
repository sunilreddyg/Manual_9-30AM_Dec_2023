package datadriven.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Excel {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fi=new FileInputStream("TestData//InputData.xlsx");
		System.out.println("File located");
		
		
		//Get Workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using above book reference
		XSSFSheet sht=book.getSheet("config");
		
		//Target row using sheet reference
		XSSFRow row=sht.getRow(1);
		
		//Target cell using row reference
		XSSFCell cell=row.getCell(0);
		
		//Readign string data from cell
		String browser=cell.getStringCellValue();
		System.out.println(browser);
		
		//Reading url
		String URL=sht.getRow(1).getCell(1).getStringCellValue();
		System.out.println(URL);
		
		//Reading username and password
		String UID=row.getCell(2).getStringCellValue();
		String PWD=row.getCell(3).getStringCellValue();
		System.out.println(UID+"   "+PWD);
		
	}

}
