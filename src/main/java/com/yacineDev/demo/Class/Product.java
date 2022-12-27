package com.yacineDev.demo.Class;

import jakarta.persistence.*;
import org.hibernate.annotations.ValueGenerationType;

// the entity to specify that it is a table
@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // for auto increment
    private int Id ;

    private String name ;
    private int price ;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
