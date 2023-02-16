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
    private Long idF;
    @Column(name = "nomF")
    private String nomF;
    @Column(name = "email")
    private String email;
    @Column(name = "n_tel")
    private int n_tel;

    public Fournisseur() {
    }

    public Fournisseur(Long id, String nom, String email, int nTel) {
        this.idF = id;
        this.nomF = nom;
        this.email = email;
        this.n_tel = nTel;
    }

    public Long getIdF() {
        return idF;
    }

    public void setIdF(Long idF) {
        this.idF = idF;
    }

    public String getNomF() {
        return nomF;
    }

    public void setNomF(String nomF) {
        this.nomF = nomF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getN_tel() {
        return n_tel;
    }

    public void setN_tel(int n_tel) {
        this.n_tel = n_tel;
    }

    @Override
    public String toString() {
        return "Fournisseur{" +
                "id=" + idF +
                ", nom='" + nomF + '\'' +
                ", email='" + email + '\'' +
                ", nTel='" + n_tel + '\'' +
                '}';
    }
}
