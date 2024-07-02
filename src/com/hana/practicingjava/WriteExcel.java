package com.hana.practicingjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteExcel {
	
	//String filePath = "//Users//shinmaibam//Documents";
	String filePath = "//Users//Hayabusa//Desktop";
	String fileName = "userLogin.xlsx";
	String sheetName = "Data";
	int colIdx = 2;

	
	/*
	 * Program to read a specific Column value from an excel spreadsheet
	 */
	public void read_specific_col_excel() throws IOException {

			File file = new File(filePath+"//"+fileName);
			FileInputStream inputStream = new FileInputStream(file);
			Workbook wb = null;
			//wb = new XSSFWorkbook(inputStream);
			
			//Find the file extension by splitting file name in substring  and getting only extension name
		    String fileExtensionName = fileName.substring(fileName.indexOf("."));

		    //To check file extension and create object accordingly
		    if(fileExtensionName.equals(".xlsx")){
		    		wb = new XSSFWorkbook(inputStream);
		    }else if(fileExtensionName.equals(".xls")){
		    		wb = new HSSFWorkbook(inputStream);
		    }
			
			Sheet ws = wb.getSheet(sheetName);
			
			List<String> lstStr = new ArrayList<String>();
			
			//To get Row Count 
			int rowCount = ws.getLastRowNum() - ws.getFirstRowNum();
			System.out.println("Row Count is: "+ rowCount);
			
			//To Read a specific Column value (String)
			for (Row rw: ws) {
				if(rw.getRowNum() == 0) {
					continue;
				}
				Cell cell = rw.getCell(colIdx);
				lstStr.add(cell.getStringCellValue());	
			}
			
			System.out.println("Value of the desire column is: "+ lstStr);
			
			inputStream.close();
		}


}
