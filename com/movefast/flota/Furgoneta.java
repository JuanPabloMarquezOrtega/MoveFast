

package com.movefast.flota;

/**
 *
 * @author orff_13
 */
public class Furgoneta extends Vehicle {
    
    private int carrega;

    public Furgoneta(int carrega, String matricula, TipoCarnet tipoCarnet, double preu) {
        super(matricula, tipoCarnet, preu);
        this.carrega = carrega;
    }

    public int getCarrega() {
        return carrega;
    }

    public void setCarrega(int carrega) {
        this.carrega = carrega;
    }

    @Override
    public String toString() {
        return super.toString() + "Furgoneta{" + "carrega=" + carrega + '}';
    }

}
