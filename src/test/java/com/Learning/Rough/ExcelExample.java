package com.Learning.Rough;

import java.io.File;  
import java.io.FileInputStream;  
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
 
public class ExcelExample  
{  
public static void main(String[] args)   
{  
try  
{  
File file = new File("C:\\Learning\\Test.xlsx");   //creating a new file instance  
FileInputStream fis = new FileInputStream(file);   //obtaining bytes from the file  
Workbook workbook =WorkbookFactory.create(fis) ;
Sheet sheet0 = workbook.getSheetAt(0);
for (Row row : sheet0) {
	
	for (Cell cell: row) {
	
		
System.out.println((cell.getStringCellValue())+"\t");






}
	System.out.println("\n");
		
	}
	
	
	
	








}  
catch(Exception e)  
{  
e.printStackTrace();  
}  
}  
}  