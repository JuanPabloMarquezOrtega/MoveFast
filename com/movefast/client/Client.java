package com.movefast.client;

public abstract class Client {
    private String nom;
    private Targeta targeta;
    private String DNI;

    public Client(String nom, Targeta targeta, String dni) {
        this.nom = nom;
        this.targeta = targeta;
        this.DNI = dni;
    }

    public String getNom() {
        return nom;
    }

    public Targeta getTargeta() {
        return targeta;
    }

    public String getDNI() { return DNI;
    }

    
}