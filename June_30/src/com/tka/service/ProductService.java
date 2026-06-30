package com.tka.service;

import java.util.ArrayList;

import com.tka.dao.ProductDao;
import com.tka.entity.Product;

public class ProductService {

    ProductDao dao = new ProductDao();

    public void addProduct(Product p) {
        dao.addProduct(p);
    }

    public ArrayList<Product> displayProducts() {
        return dao.getProducts();
    }

    public Product searchProduct(int id) {

        for(Product p : dao.getProducts()) {
            if(p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public boolean updateQuantity(int id, int qty) {

        Product p = searchProduct(id);

        if(p != null) {
            p.setQuantity(qty);
            return true;
        }
        return false;
    }

    public Product mostExpensiveProduct() {

        ArrayList<Product> list = dao.getProducts();

        if(list.isEmpty())
            return null;

        Product max = list.get(0);

        for(Product p : list) {
            if(p.getPrice() > max.getPrice()) {
                max = p;
            }
        }

        return max;
    }

    public double totalInventoryValue() {

        double total = 0;

        for(Product p : dao.getProducts()) {
            total += p.getPrice() * p.getQuantity();
        }

        return total;
    }
}
