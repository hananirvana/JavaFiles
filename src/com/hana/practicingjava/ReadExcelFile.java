package com.hana.practicingjava;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	public static void main(String[] args) throws InvalidFormatException, IOException {
		File file = new File("C:\\Users\\Hayabusa\\Desktop\\ExcelBook.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);

		XSSFSheet sh = wb.getSheetAt(0);
		// Iterate through the rows
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			// Get the row
			XSSFRow row = sh.getRow(i);

			// Iterate through the cells
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				// Get the cell
				XSSFCell cell = row.getCell(j);

				// Print the cell value to the console
				System.out.println(cell.getStringCellValue());
			}
		}
	}
}
