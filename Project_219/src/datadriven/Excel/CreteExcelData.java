package datadriven.Excel;


import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreteExcelData 
{

	public static void main(String[] args) throws IOException {
		
		
		// Create a workbook 
        XSSFWorkbook book = new XSSFWorkbook(); 
 
        // Create a sheet 
        XSSFSheet sheet = book.createSheet("Data");
        
        //Create a row
        XSSFRow row=sheet.createRow(0);
       
        row.createCell(0).setCellValue("NAME");
        row.createCell(1).setCellValue("Contact");
        
        //Write Data into Cells
        XSSFRow row1=sheet.createRow(1);
        row1.createCell(0).setCellValue("Uday");
        row1.createCell(1).setCellValue("9030248885");
        
      //Write Data into Cells
        XSSFRow row2=sheet.createRow(2);
        row2.createCell(0).setCellValue("Ajay");
        row1.createCell(1).setCellValue("9030248885");
    

        //Create Excel OutputFile
        FileOutputStream fo=new FileOutputStream("TestData\\newdata.xlsx");
        book.write(fo);   //Write data into file
        book.close();     //Save file
        
        
	}

}
