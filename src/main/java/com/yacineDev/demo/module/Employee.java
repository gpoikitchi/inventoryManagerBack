package com.yacineDev.demo.module;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="employee")
public class Employee implements Serializable {
    @Id
    @Column(name="idE")
    private Long idE;
    @Column(name = "email")
    private String email;
    @Column(name = "nom")
    private String nom ;
    @Column(name = "prenom")
    private String prenom;
    @Column(name="nTel")
    private String nTel;

    @Column(name="nomUtilisateur")
    private String nomUtilisateur;

    @Column(name="motDePasse")
    private String motDePasse;

    @Column(name="numeroRue")
    private Integer numRue;

    @Column(name="nomRue")
    private String nomRue;

    @Column(name="codePostal")
    private int codePostal;

    @Column(name="ville")
    private String ville;

    public Employee(){

    }
    public Employee(Long id, String email, String nom, String prenom, String nTel, String nomUtilisateur, String motDePasse, int numRue, String nomRue, int codePostal, String ville) {
        this.idE = id;
        this.email = email;
        this.nom = nom;
        this.prenom = prenom;
        this.nTel = nTel;
        this.nomUtilisateur = nomUtilisateur;
        this.motDePasse = motDePasse;
        this.numRue = numRue;
        this.nomRue = nomRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public Long getIdE() {
        return idE;
    }

    public void setIdE(Long idE) {
        this.idE = idE;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return nom;
    }

    public void setName(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getnTel() {
        return nTel;
    }

    public void setnTel(String nTel) {
        this.nTel = nTel;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public Integer getNumRue() {
        return numRue;
    }

    public void setNumRue(Integer numRue) {
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
        return "Employee{" +
                "id=" + idE +
                ", email='" + email + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", phone='" + nTel + '\'' +
                ", nomUtilisateur='" + nomUtilisateur + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                ", numRue=" + numRue +
                ", nomRue='" + nomRue + '\'' +
                ", codePostal=" + codePostal +
                ", ville='" + ville + '\'' +
                '}';
    }
}
