package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtil {
    static Workbook workbook;
    static Sheet sheet;

//   this method loads the excel file seelct the desired shet
    public static void loadExcelFile(String excelPath, String sheetName){
        try {
            FileInputStream inputStream = new FileInputStream(excelPath);
            workbook = new XSSFWorkbook(inputStream); //it will create workbook from file
            sheet = workbook.getSheet(sheetName); //get the sheet name
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
//    this method retrun the value from the row and column
    public static String getCellData(int rowNum, int colNum){
        if (sheet == null) {
            throw new RuntimeException("Sheet is null");
        }else if (sheet.getRow(rowNum)== null){
            System.out.println("row values are null");
        }
        return  sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
    }
}
