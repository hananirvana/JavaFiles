package com.hana.practicingjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class MyExcelTest {

	public static void main(String[] args) throws IOException {

		/*
		 * Program to read all data from an excel spreadsheet regardless of cell type
		 */
			
			String filePath = "C:\\Users\\Hayabusa\\Documents";
			String fileName = "UserLogin.xlsx";
			String sheetName = "Data";
			int colIdx = 2;
			
			File file = new File(filePath+"//"+fileName);
			FileInputStream inputStream = new FileInputStream(file);
			Workbook wb = null;
			
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
			
			//to format cell type
			DataFormatter dataFormatter = new DataFormatter();
			
			for (Row row: ws) {
				if(row.getRowNum() == 0) {
					continue;
				}
	            for(Cell cell: row) {
	                String cellValue = dataFormatter.formatCellValue(cell);
	                System.out.print(cellValue + ", ");
	            }
		        System.out.println();
			}
			
			
			inputStream.close();
			wb.close();
		}

		
}


