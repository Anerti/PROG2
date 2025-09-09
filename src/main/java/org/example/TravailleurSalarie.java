package org.example;

import java.util.List;

public class TravailleurSalarie extends Travailleur {
    private double salaire;

    public TravailleurSalarie(String id, String nom, String prenom, String email, String telephone, double salaire, List<Pointage> pointages) {
        super(id, nom, prenom, email, telephone, pointages);
        this.salaire = salaire;
    }
}
