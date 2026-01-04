package com.inventory.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

    @Id
    private int id;

    private String name;
    private String description;
    private double price;
    private int quantity;

    public Product() {}

    public Product(int id, String name, String description, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    // getters & setters
}
