package com.yacineDev.demo.module;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id ;
    private String email;
    private String name ;
    private String jobTitle ;
    private String phone ;
    private String image ;
    @Column(nullable = false,updatable = false)
    private String employeeCode;

    public Employee(){

    }

    public Employee(Long id, String email, String name, String jobTitle, String phone, String image, String employeeCode) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.image = image;
        this.employeeCode = employeeCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phone='" + phone + '\'' +
                ", image='" + image + '\'' +
                ", employeeCode='" + employeeCode + '\'' +
                '}';
    }
}
