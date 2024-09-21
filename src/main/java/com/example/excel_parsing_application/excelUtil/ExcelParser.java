package com.example.excel_parsing_application.excelUtil;


import com.example.excel_parsing_application.model.Persons;
import com.example.excel_parsing_application.model.Product;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelParser {

    public static List<List<Product>> parseExcelFile(InputStream is) {
        List<List<Product>> allSheetData = new ArrayList<>();

        try {
            Workbook workbook = new XSSFWorkbook(is);

            //For sheets
            for (int i = 0; i < workbook.getNumberOfSheets(); i++) {

                Sheet sheet = workbook.getSheetAt(i);
                String sheetName = sheet.getSheetName();

                List<Product> sheetData = new ArrayList<>();


                if ("Products".equalsIgnoreCase(sheetName)) {

                    for (int rowIndex = 0; rowIndex < sheet.getLastRowNum(); rowIndex++) {
                        Row row = sheet.getRow(rowIndex);

                        if (row == null) {
                            continue;
                        }

                        Product product = new Product();

                        for (int cellIndex = 0; cellIndex < row.getLastCellNum(); cellIndex++) {

                            Cell cell = row.getCell(cellIndex);


                            if (cell != null) {
                                switch (cellIndex) {
                                    case 0:

                                        product.setProductId((long) cell.getNumericCellValue());
                                        break;
                                    case 1:

                                        product.setProductName(cell.getStringCellValue());
                                        break;
                                    case 2:

                                        product.setPrice((double) cell.getNumericCellValue());
                                        break;
                                    case 3:

                                        product.setCategory(cell.getStringCellValue());
                                        break;
                                    case 4:

                                        product.setStock((long) cell.getNumericCellValue());
                                        break;
                                    default:
                                        break;
                                }
                            }
                        }
                        sheetData.add(product);
                    }
                } else if ("Persons".equalsIgnoreCase(sheetName)) {

                    for (int rowIndex = 0; rowIndex < sheet.getLastRowNum(); rowIndex++) {
                        Row row = sheet.getRow(rowIndex);

                        if (row == null) {
                            continue;
                        }

                        Persons persons = new Persons();

                        for (int cellIndex = 0; cellIndex < row.getLastCellNum(); cellIndex++) {

                            Cell cell = row.getCell(cellIndex);


                            if (cell != null) {
                                switch (cellIndex) {
                                    case 0:

                                        persons.setPersonId((long) cell.getNumericCellValue());
                                        break;
                                    case 1:

                                        persons.setName(cell.getStringCellValue());
                                        break;
                                    case 2:

                                        persons.setCity(cell.getStringCellValue());
                                        break;
                                    case 3:

                                        persons.setAge((int) cell.getNumericCellValue());
                                        break;
                                    case 4:

                                        persons.setOccupation(cell.getStringCellValue());
                                        break;
                                    default:
                                        break;
                                }
                            }
                        }
                        sheetData.add(persons);
                    }

                }

                allSheetData.add(sheetData);
            }

            workbook.close();

        } catch (Exception e) {
            throw new RuntimeException("Failed : " + e.getMessage());
        }
        return allSheetData;
    }
}
