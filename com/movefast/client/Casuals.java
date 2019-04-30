package com.movefast.client;

public class Casuals extends Client {
    private String dataNaixement;

    public Casuals(String nom, Targeta targeta, String DNI, String dataNaixement) {
        super(nom, targeta, DNI);
        this.dataNaixement = dataNaixement;
    }

    public String getDataNaixement() {
        return dataNaixement;
    }
}
