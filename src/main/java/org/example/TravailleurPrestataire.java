package org.example;

import java.time.Instant;
import java.util.List;

public class TravailleurPrestataire extends Travailleur {
    private double salaire;
    private double tauxJournalier;
    private double nombreDeJour;


    public TravailleurPrestataire(String id, String nom, String prenom, String email, String telephone,  double salaire, double NombreDeJour, double tauxJournalier, List<Pointage> pointages) {
        super(id, nom, prenom, email, telephone, pointages);
        this.tauxJournalier = tauxJournalier;
        this.nombreDeJour = NombreDeJour;
        this.salaire = salaire;
    }

    public double calculNombreJr(Instant startDate, Instant endDate) {
        return (double) (endDate.toEpochMilli() - startDate.toEpochMilli()) / (1000 * 3600 * 24);
    }

    public double calculSalaire(Instant startDate, Instant endDate, double tauxJournalier) {
        return (double) (endDate.toEpochMilli() - startDate.toEpochMilli()) / (1000 * 3600 * 24) * tauxJournalier;
    }
}
