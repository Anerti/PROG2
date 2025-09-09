package org.example;

import java.util.List;

public class Travailleur {
    private String id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private List<Pointage> pointages;

    public Travailleur(String id, String nom, String prenom, String email, String telephone, List<Pointage> pointages) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.pointages = pointages;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
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
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public List<Pointage> getPointages() {
        return pointages;
    }
    public void setPointages(List<Pointage> pointages) {
        this.pointages = pointages;
    }
}
