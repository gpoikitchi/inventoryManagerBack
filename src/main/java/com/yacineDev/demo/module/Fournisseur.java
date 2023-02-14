package com.yacineDev.demo.module;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name="fournisseur")
public class Fournisseur implements Serializable {
    @Id
    @Column(name = "idF")
    private Long id ;
    @Column(name = "nomF")
    private String nom ;
    @Column(name = "email")
    private String email;
    @Column(name = "nTel")
    private int nTel;

    public Fournisseur() {
    }

    public Fournisseur(Long id, String nom, String email, int nTel) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.nTel = nTel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getnTel() {
        return nTel;
    }

    public void setnTel(int nTel) {
        this.nTel = nTel;
    }

    @Override
    public String toString() {
        return "Fournisseur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                ", nTel='" + nTel + '\'' +
                '}';
    }
}
