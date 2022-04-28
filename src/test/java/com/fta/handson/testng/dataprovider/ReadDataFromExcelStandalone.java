package com.fta.handson.testng.dataprovider;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataFromExcelStandalone {

    public static void main(String[] args) throws IOException {

        //Load the .xlsx file
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir").concat("/src/test/resources/data/user-login.xlsx"));

        //Use the Apache POI library classes to interact with .xlsx file
        //Instantiate XSSFWorkbook to do read and write tasks with the excel workbook
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        //Instantiate XSSFSheet to perform read and write tasks with an excel sheet
        XSSFSheet sheet = workbook.getSheet("login-credentials");

        //Iterate over the data, which is in rows and columns in the excel sheet
        //To do that, we need to know how many rows are there, and how many columns are there
        int rows = sheet.getLastRowNum();
        int columns = sheet.getRow(0).getLastCellNum();

        //Now, get the number of rows and number of columns
        for(int i=0; i<= rows; i++){
            for(int j=0; j< columns; j++){
                System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+" ");
            }
            System.out.println();
        }
    }
}
