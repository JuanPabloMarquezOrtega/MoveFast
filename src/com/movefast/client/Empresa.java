package com.movefast.client;

public class Empresa {
    private String nom;
    private String cif;

    public Empresa(String nom, String cif) {
        this.nom = nom;
        this.cif = cif;
    }

    public String getNom() {
        return nom;
    }

    public String getCif() {
        return cif;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nom='" + nom + '\'' +
                ", cif='" + cif + '\'' +
                '}';
    }
}
