package datadriven.Excel.Keywords;

	import org.apache.poi.ss.usermodel.*;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;

	public class ExcelReader 
	{
	    
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

	    // Test the readExcel method
	    public static void main(String[] args) 
	    {
	        String filePath = "TestData\\InputData.xlsx";
	        String sheetname="multiple";
	        
	        
	        List<List<String>> data=readExcel(filePath, sheetname);
	        
	        String ak1=data.get(1).get(0);
	        System.out.println(ak1);
	        
	        for (List<String> row : data) 
	        {
				 String UID=row.get(0);
				 String PWD=row.get(1);
				 System.out.println(UID+"  "+PWD);
			}
	        
	    }
	}



