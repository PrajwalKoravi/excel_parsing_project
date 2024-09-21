package com.example.excel_parsing_application.services;

import com.example.excel_parsing_application.model.Persons;
import com.example.excel_parsing_application.model.Product;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;

@Service
public interface IExcelService {

    List<List<Product>> parseExcelFile(InputStream inputStream);

    void saveProducts(List<Product> products);

    void savePersons(List<Persons> persons);


}
