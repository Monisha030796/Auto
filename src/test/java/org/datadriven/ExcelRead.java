package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.hc.client5.http.impl.classic.MainClientExec;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {
		ExcelRead read=new ExcelRead();
		read.excelReading();
	}
	public void excelReading() throws IOException {
		File file=new File("C:\\Users\\aruna\\eclipse-workspace\\eclipse"
				+ "\\MavenDemo\\src\\test\\resources\\Book1.xlsx");
    FileInputStream inputStream=new FileInputStream(file);
    Workbook workbook=new XSSFWorkbook(inputStream);
    Sheet sheet = workbook.getSheet("sheet1");
    for (int i = 1; i <=10; i++) {
    	Row row = sheet.getRow(i);
    	for (int j = 0; j <=1; j++) {
			Cell cell = row.getCell(j);
			CellType cellType = cell.getCellType();
			//DataFormatter dft=new DataFormatter();
			//String value = dft.formatCellValue(cell);
			//System.out.println(value);
			
			String stringCellValue = cell.getStringCellValue();
		   System.out.println(stringCellValue);
			
		    double numericCellValue = cell.getNumericCellValue();
		    long cellValue=(long) numericCellValue;
		    System.out.println(cellValue);
		}
	}
//    Row row = sheet.getRow(2);
//    Cell cell = row.getCell(0);
   // CellType cellType = cell.getCellType();
   // System.out.println(cellType);
     //String stringCellValue = cell.getStringCellValue();
    //System.out.println(stringCellValue);
  
//    Cell cell2 = row.getCell(1);
//    CellType cellType2 = cell2.getCellType();
//    System.out.println(cellType2);
//    double numericCellValue = cell2.getNumericCellValue();
//    long cellValue=(long) numericCellValue;
//    System.out.println(cellValue);
    
    
    
    
    
 
	   
   }
	}


