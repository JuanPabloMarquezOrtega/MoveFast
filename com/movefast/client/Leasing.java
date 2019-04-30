package com.movefast.client;

public class Leasing extends Client {
    private Empresa empresa;

    public Leasing(String nom, Targeta targeta, Empresa empresa, String DNI) {
        super(nom, targeta, DNI);
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