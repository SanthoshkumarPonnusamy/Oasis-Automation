package com.oasis.ui.utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.util.Iterator;


public class ExcelHelper {

    public static String ReadExcelData(String SheetName, String ParmName) throws Exception {

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/TestData.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            XSSFSheet worksheet = workbook.getSheet(SheetName);
            Iterator<Row> rowIterator = worksheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                if (row.getCell(0).getStringCellValue().equalsIgnoreCase(ParmName)) {
                    if (row.getCell(1)!=null)
                        if (row.getCell(1).getCellType() == CellType.STRING) {
                            return String.valueOf(row.getCell(1).getNumericCellValue());
                        } else {
                            return row.getCell(1).getStringCellValue();
                        }
                }
            }
        } catch (Exception e) {
            throw new Exception("Failed to retrieve value from test data xlsx \n" + e.getMessage());
        } finally {
            fileInputStream.close();
        }
        return null;
    }

    public static String[] ReadExcelValues(String SheetName, String ParmName) throws Exception {
        int arrLength = 1;
        String[] parmFields = ParmName.split(",");
        if (parmFields.length > 1) {
            arrLength = parmFields.length;
        }
        String[] value = new String[arrLength];
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/TestData.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            XSSFSheet worksheet = workbook.getSheet(SheetName);
            for (int i = 0; i < arrLength; i++) {
                Iterator<Row> rowIterator = worksheet.iterator();
                while (rowIterator.hasNext()) {
                    Row row = rowIterator.next();
                    if (row.getCell(0).getStringCellValue().equalsIgnoreCase(parmFields[i].replaceAll("'", "").trim())) {
                        if (row.getCell(1).getCellType() == CellType.NUMERIC) {
                            value[i] = String.valueOf(row.getCell(1).getNumericCellValue());
                        } else {
                            value[i] = row.getCell(1).getStringCellValue();
                        }
                        break;
                    }
                }
            }
        } catch (Exception e) {
            throw new Exception("Failed to retrieve value from test data xlsx \n" + e.getMessage());
        } finally {
            fileInputStream.close();
        }
        return value;
    }

    public static String ReadExcelColumnData(String SheetName, String SearchData, String ColumnNameValue) throws Exception {
        String lookupValue=null;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/TestData.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            XSSFSheet worksheet = workbook.getSheet(SheetName);
            int noOfColumns = worksheet.getRow(0).getLastCellNum();
            int colNumValue=-1;
            for (int i=0;i<noOfColumns;i++){
                if(worksheet.getRow(0).getCell(i).getStringCellValue().equalsIgnoreCase(ColumnNameValue)){
                    colNumValue=i;
                }
            }
            if(colNumValue==-1){
                throw new Exception("No Column Name matched to Search Value");
            }

            Iterator<Row> rowIterator = worksheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                if (row.getCell(0).getStringCellValue().equalsIgnoreCase(SearchData)) {
                    if (row.getCell(colNumValue).getCellType() == CellType.NUMERIC) {
                        lookupValue = String.valueOf(row.getCell(colNumValue).getNumericCellValue());
                    } else {
                        lookupValue = row.getCell(colNumValue).getStringCellValue();
                    }
                    break;
                }
            }

        } catch (Exception e) {
            throw new Exception("Failed to retrieve value from test data xlsx \n" + e.getMessage());
        } finally {
            fileInputStream.close();
        }
        return lookupValue;
    }

}
