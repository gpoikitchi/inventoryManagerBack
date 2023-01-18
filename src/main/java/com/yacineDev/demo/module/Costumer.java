package com.yacineDev.demo.module;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Costumer implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String name ;
    private String email;
    private String phone;
    private int orders;
    private Long ordersTotal;
    private String costumerSince;
    private boolean isChecked;

    public Costumer(){

    }

    public Costumer(Long id, String name, String email, String phone, int orders, Long ordersTotal, String costumerSince, boolean isChecked) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.orders = orders;
        this.ordersTotal = ordersTotal;
        this.costumerSince = costumerSince;
        this.isChecked = isChecked;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getOrders() {
        return orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }

    public Long getOrdersTotal() {
        return ordersTotal;
    }

    public void setOrdersTotal(Long ordersTotal) {
        this.ordersTotal = ordersTotal;
    }

    public String getCostumerSince() {
        return costumerSince;
    }

    public void setCostumerSince(String costumerSince) {
        this.costumerSince = costumerSince;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    @Override
    public String toString() {
        return "Costumers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", orders=" + orders +
                ", ordersTotal=" + ordersTotal +
                ", costumerSince='" + costumerSince + '\'' +
                ", isChecked=" + isChecked +
                '}';
    }
}
