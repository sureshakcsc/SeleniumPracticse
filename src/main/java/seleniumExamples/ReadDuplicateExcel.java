package seleniumExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDuplicateExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//define the Excel path 
		File excelPath= new File("D:\\read\\ExcelRead.xlsx");

		FileInputStream fis = new FileInputStream(excelPath);
		
		//define the Workbook
		
		    XSSFWorkbook book = new XSSFWorkbook(fis);
		    
		    //get the Sheet 
		    
		XSSFSheet sheet = book.getSheetAt(0);
		
		//Get the Total number of Rows 
		
	int numberOfRows =	sheet.getLastRowNum();
	
	  System.out.println(numberOfRows);
	  
	   int numberofColumns =sheet.getRow(0).getLastCellNum();
	   
	   System.out.println(numberofColumns);
		    
	   for(int i=0;i<numberofColumns;i++)
	   {
		   //collecting all  rows 
		   
		   XSSFRow allRows= sheet.getRow(i);
		   
		   for(int j=0;j<numberofColumns;j++)
		   {
			   //collect total number of columns 
			   
			  XSSFCell  allColumns= allRows.getCell(j);
			  
			  switch(allColumns.getCellType())
			  {
			  case STRING: System.out.println(allColumns.getStringCellValue());
			  break;
			  case NUMERIC: System.out.println(allColumns.getNumericCellValue());
			  break;
			  }
			  System.out.print(" ||");
		   }
		   System.out.println();
	   }
		    
		    
	}

}
