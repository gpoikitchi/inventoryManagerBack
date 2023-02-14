package com.yacineDev.demo.module;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="produit")
public class Product implements Serializable {
    @Id
    @Column(name = "id_produit")
    private Long id ;
    @Column(name = "nom")
    private String name ;
    @Column(name = "category")
    private String category ;
    @Column(name = "prix_unitaire")
    private float price ;
   @Column(name="produit_en_stock")
    private int quantity ;


    public Product() {
    }

    public Product(Long id, String name, String category, float price, int quantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
