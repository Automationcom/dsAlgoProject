package com.Heroku.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	 XSSFWorkbook wb;
	
	public ExcelDataProvider()  {
		File src = new File("./TestData/SheetData.xlsx");
		try {
		FileInputStream fis = new FileInputStream(src);
	     
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
         System.out.println("unable to read Excel file "+ e.getMessage());
			
		} 
		}
	
	
	public  String getStringData(String sheetName,int row,int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		
	}
	public double getNumericData(String sheetName,int row,int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}
	
	public String getStringData(int sheetIndex,int row,int column) {
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();

}	
//	public static void main(String[] args) {
		//String usname;
	//	usname= getStringData("Sheet1",0,1);
		//System.out.println(usname);
	}
