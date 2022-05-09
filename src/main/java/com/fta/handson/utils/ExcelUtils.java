package com.fta.handson.utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public final class ExcelUtils {

    private ExcelUtils(){}

    @DataProvider(name = "cred-data")
    public static Object[][] credentialsProvider(Method method) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir").concat("/src/test/resources/data/user-login.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("login-credentials");

        int rows = sheet.getLastRowNum();
        int columns = sheet.getRow(0).getLastCellNum();

        Object[][] creds = new Object[rows][1];
        Map<String, String> credMap ;

        for (int i = 1; i <= rows; i++) {
            credMap = new HashMap<>();
            for (int j = 0; j < columns; j++) {
                credMap.put(
                        sheet.getRow(0).getCell(j).getStringCellValue(),
                        sheet.getRow(i).getCell(j).getStringCellValue()
                );
            }
            creds[i-1][0] = credMap;
        }
        return creds;
    }

}
