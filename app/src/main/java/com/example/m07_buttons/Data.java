package com.example.m07_buttons;

public class Data {
    private String nom;
    private int imageID;

    public Data(String nom, int imageID) {
        this.nom = nom;
        this.imageID = imageID;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}
