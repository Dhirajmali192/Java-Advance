package com.tka.controller;


import java.util.Scanner;

import com.tka.entity.Product;
import com.tka.service.ProductService;

public class ProductController {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductService service = new ProductService();

        int choice;

        do {

            System.out.println("\n===== PRODUCT INVENTORY SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Quantity");
            System.out.println("5. Most Expensive Product");
            System.out.println("6. Total Inventory Value");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    Product product = new Product(id, name, price, qty, category);

                    service.addProduct(product);

                    System.out.println("Product Added Successfully!");

                    break;

                case 2:

                    for (Product p : service.displayProducts()) {
                        System.out.println("--------------------");
                        System.out.println(p);
                    }

                    break;

                case 3:

                    System.out.print("Enter Product ID: ");
                    id = sc.nextInt();

                    Product p = service.searchProduct(id);

                    if (p != null)
                        System.out.println(p);
                    else
                        System.out.println("Product Not Found");

                    break;

                case 4:

                    System.out.print("Enter Product ID: ");
                    id = sc.nextInt();

                    System.out.print("Enter New Quantity: ");
                    qty = sc.nextInt();

                    if (service.updateQuantity(id, qty))
                        System.out.println("Quantity Updated Successfully.");
                    else
                        System.out.println("Product Not Found.");

                    break;

                case 5:

                    Product max = service.mostExpensiveProduct();

                    if (max != null)
                        System.out.println(max);
                    else
                        System.out.println("Inventory is Empty.");

                    break;

                case 6:

                    System.out.println("Total Inventory Value = " +
                            service.totalInventoryValue());

                    break;

                case 7:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice.");

            }

        } while (choice != 7);

    }
}
