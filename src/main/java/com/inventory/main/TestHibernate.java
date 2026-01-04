package com.inventory.main;

import com.inventory.dao.ProductDao;
import com.inventory.entity.Product;

public class TestHibernate {

    public static void main(String[] args) {

        ProductDao dao = new ProductDao();

        Product p1 = new Product(
                1,
                "Laptop",
                "HP i5",
                55000,
                10
        );

        dao.saveProduct(p1);

        System.out.println("Product Inserted Successfully!");
    }
}
