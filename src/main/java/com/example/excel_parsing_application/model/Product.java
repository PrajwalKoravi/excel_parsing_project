package com.example.excel_parsing_application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    private Long productId;
    private String productName;
    private Double Price;
    private String category;
    private Long stock;


    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "ExcelFile{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", Price=" + Price +
                ", category='" + category + '\'' +
                ", stock=" + stock +
                '}';
    }

    public Product(Long productId, String productName, Double price, String category, Long stock) {
        this.productId = productId;
        this.productName = productName;
        Price = price;
        this.category = category;
        this.stock = stock;
    }


    public Product() {
       super();
    }
}
