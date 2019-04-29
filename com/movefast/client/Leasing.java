package com.movefast.client;

public class Leasing extends Client {
    private Empresa empresa;

    public Leasing(String nom, Targeta targeta, Empresa empresa) {
        super(nom, targeta);
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    @Override
    public String toString() {
        return "Leasing{" +
                "empresa=" + empresa +
                '}';
    }
}