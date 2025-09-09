package org.example;

import java.time.Instant;
import java.time.LocalDate;

public class Pointage {
    private String mission;
    private LocalDate date;
    private TypeTravail travail;
    private double quota;
    private String description;

    public Pointage(String mission, LocalDate date, TypeTravail travail, double quota, String description) {
        this.mission = mission;
        this.date = date;
        this.travail = travail;
        this.quota = quota;
        this.description = description;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public TypeTravail getTravail() {
        return travail;
    }

    public void setTravail(TypeTravail travail) {
        this.travail = travail;
    }

    public double getQuota() {
        return quota;
    }

    public void setQuota(double quota) {
        this.quota = quota;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean checkQuota() {
        if (this.quota > 1 || this.quota <= 0) {
            throw new IllegalArgumentException("Quota value not valid");
        }
        return this.quota == 1;
    }
}
