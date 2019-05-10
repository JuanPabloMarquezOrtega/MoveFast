package com.movefast.client;

public class Targeta {
    private int numTargeta;
    private int codiSeguretatCV;
    private String nomPropietari;
    private String dataCaducitat;

    public Targeta(int numTargeta, int codiSeguretatCV, String nomPropietari, String dataCaducitat) {
        this.numTargeta = numTargeta;
        this.codiSeguretatCV = codiSeguretatCV;
        this.nomPropietari = nomPropietari;
        this.dataCaducitat = dataCaducitat;
    }

    public int getNumTargeta() {
        return numTargeta;
    }
}
