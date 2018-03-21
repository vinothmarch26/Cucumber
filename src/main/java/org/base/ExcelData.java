package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public static String path =System.getProperty("user.dir");
	
	public static List<HashMap<String, String>>  data() throws Throwable {
	
	List<HashMap<String,String>> dataList = new ArrayList();
		
	File f = new File(path+"/DataFile/Exceldata.xlsx");
	
	FileInputStream stream = new FileInputStream(f);
	
	Workbook w = new XSSFWorkbook(stream);
	
	Sheet sheet = w.getSheet("data");
	
	Row headerRow = sheet.getRow(0);
	
	
	for(int i=0 ;i<sheet.getPhysicalNumberOfRows();i++) {
		
	    Row currentRow = sheet.getRow(i);
		HashMap<String,String> mapData= new HashMap<String,String>();  
         		
 	      for(int j =0;j<headerRow.getPhysicalNumberOfCells();j++) {
 	    	  
 	    	  Cell currentCell = currentRow.getCell(j);
 	    	  
 	    	  switch (currentCell.getCellType()) {
 	    	   	  case Cell.CELL_TYPE_NUMERIC:
 	    	   		  double d =currentCell.getNumericCellValue();
 	    	   		  long x =(long)d;
 	    			  mapData.put(headerRow.getCell(j).getStringCellValue(),String.valueOf(x));
 	    		  break;
 	    	  case Cell.CELL_TYPE_STRING:
 	    			  mapData.put(headerRow.getCell(j).getStringCellValue(),currentCell.getStringCellValue());
 	    		  break;
 	    	  }
 	      }
	dataList.add(mapData);
	}
	return dataList;
		
	}
	
	
	public static void  main(String args[]) throws Throwable {
																	 
		System.out.println(data().get(1).get("EmployeeID"));
		System.out.println(data().get(1).get("firstname"));
		System.out.println(data().get(1).get("lastname"));
		System.out.println(data().get(1).get("martialstatus"));
		System.out.println(data().get(1).get("hobby"));
		System.out.println(data().get(1).get("phonenumber"));
		System.out.println(data().get(1).get("username"));
		System.out.println(data().get(1).get("email"));
		System.out.println(data().get(1).get("password"));
		System.out.println(data().get(1).get("confirmpassword"));
		System.out.println(data().get(1).get("browser"));
		System.out.println(data().get(1).get("url"));
		System.out.println(data().get(1).get("country"));
		System.out.println(data().get(1).get("day"));
		System.out.println(data().get(1).get("month"));
		System.out.println(data().get(1).get("y"));
		
	}
	
	
}
