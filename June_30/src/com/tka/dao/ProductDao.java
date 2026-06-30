package com.tka.dao;

import java.util.ArrayList;

import com.tka.entity.Product;

public class ProductDao {

    ArrayList<Product> productList = new ArrayList<>();

    public void addProduct(Product p) {
        productList.add(p);
    }

    public ArrayList<Product> getProducts() {
        return productList;
    }
}