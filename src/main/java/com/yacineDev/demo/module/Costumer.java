package com.yacineDev.demo.module;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="client")
public class Costumer implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false,updatable = false)
    private Long id;
    @Column(name = "nom")
    private String nom ;
    @Column(name = "prenom")
    private String prenom ;
    @Column(name = "email")
    private String email;
    @Column(name = "nTel")
    private String nTel;
    @Column(name = "numRue")
    private int numRue ;
    @Column(name = "nomRue")
    private String nomRue;
    @Column(name = "codePostal")
    private int codePostal;
    @Column(name = "ville")
    private String ville ;

    public Costumer(){

    }
    public Costumer(Long id, String nom, String prenom, String email, String nTel, int numRue, String nomRue, int codePostal, String ville) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.nTel = nTel;
        this.numRue = numRue;
        this.nomRue = nomRue;
        this.codePostal = codePostal;
        this.ville = ville;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getnTel() {
        return nTel;
    }

    public void setnTel(String nTel) {
        this.nTel = nTel;
    }

    public int getNumRue() {
        return numRue;
    }

    public void setNumRue(int numRue) {
        this.numRue = numRue;
    }

    public String getNomRue() {
        return nomRue;
    }

    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", nTel='" + nTel + '\'' +
                ", numRue=" + numRue +
                ", nomRue='" + nomRue + '\'' +
                ", codePostal=" + codePostal +
                ", ville='" + ville + '\'' +
                '}';
    }
}
