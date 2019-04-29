package com.movefast.client;

public class Casuals extends Client {
    private String DNI;
    private String dataNaixement;

    public Casuals(String nom, Targeta targeta, String DNI, String dataNaixement) {
        super(nom, targeta);
        this.DNI = DNI;
        this.dataNaixement = dataNaixement;
    }

    public String getDNI() {
        return DNI;
    }

    public String getDataNaixement() {
        return dataNaixement;
    }
}
