package datadriven.Excel.Keywords;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel 
{
	static String filepath="TestData\\";
	static XSSFWorkbook book;
	static XSSFSheet sht;
	static XSSFRow row;
	static XSSFCell cell;
	
	
	//Reusable method to get Excel workbook and sheet
	public static XSSFSheet getexcel(String filename,String sheetname)
	{
		try {
			FileInputStream fi=new FileInputStream(filepath+filename);
			book=new XSSFWorkbook(fi);
		    sht=book.getSheet(sheetname);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return sht;
	}
	
	
	//This method reads the test data from the Excel cell.
    //We are passing row number and column number as parameters.
	public static String getCellData(int RowNum, int ColNum)
	{
        cell = sht.getRow(RowNum).getCell(ColNum);
        DataFormatter formatter = new DataFormatter();
        return formatter.formatCellValue(cell);
    }
	
	//This method takes row number as a parameter and returns the data of given row number.
    public static XSSFRow getRowData(int RowNum) 
    {
        row = sht.getRow(RowNum);
        return row;
    }
    
    
    //Return Row End Cout
    public static int GetRowCount()
    {
    	return sht.getLastRowNum()+1;
    }
	
	
    /* 
	 *  Keyword:--> Write Cell Data
	 * Description:-->
	 */
	public static void WriteCellData_At_newCell(int row, int cell,String text)
	{
		sht.getRow(row).createCell(cell).setCellValue(text);
	}
	
	/* 
	 *  Keyword:--> Crete output file and Dump all to otuput file
	 * Description:-->
	 */
	public static void CreateOtuputFile(String Ofilename)
	{
		try {
			FileOutputStream fo=new FileOutputStream(filepath+Ofilename);
			book.write(fo);
			book.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	 // Method to read data from Excel file
    public static List<List<String>> readExcel(String filePath,String sheetname) 
    {
        List<List<String>> data = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream(new File(filePath));

            // Create a workbook instance
            Workbook workbook = WorkbookFactory.create(fis);

            // Get the first sheet
            Sheet sheet = workbook.getSheet(sheetname);

            // Iterate through each row
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) 
            {
                Row row = rowIterator.next();
                List<String> rowData = new ArrayList<>();

                // Iterate through each cell in the row
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();

                    // Add cell value to rowData list
                    rowData.add(cell.toString());
                }

                // Add rowData to data list
                data.add(rowData);
            }

            // Close the workbook and input stream
            workbook.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }

	
	

}
