package com.movefast.client;

public class Client {
    private String nom;
    private Targeta targeta;

    public Client(String nom, Targeta targeta) {
        this.nom = nom;
        this.targeta = targeta;
    }

    public String getNom() {
        return nom;
    }

    public Targeta getTargeta() {
        return targeta;
    }
}
