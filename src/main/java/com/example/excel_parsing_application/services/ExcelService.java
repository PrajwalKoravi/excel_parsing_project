package com.example.excel_parsing_application.services;

import com.example.excel_parsing_application.excelUtil.ExcelParser;
import com.example.excel_parsing_application.model.Persons;
import com.example.excel_parsing_application.model.Product;
import com.example.excel_parsing_application.repositories.PersonsRepo;
import com.example.excel_parsing_application.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExcelService implements IExcelService {

    @Autowired
    private PersonsRepo personsRepo;

    @Autowired
    private ProductRepo productRepo;
    @Override
    public List<List<Product>> parseExcelFile(InputStream inputStream) {

        return ExcelParser.parseExcelFile(inputStream);
    }

    @Override
    public void saveProducts(List<Product> products) {

        if (products != null && !products.isEmpty()) {
            productRepo.saveAll(products);
        }
    }

    @Override
    public void savePersons(List<Persons> persons) {

        if (persons != null && !persons.isEmpty()) {
            personsRepo.saveAll(persons);
        }
    }

}
