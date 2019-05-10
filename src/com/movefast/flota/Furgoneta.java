

package com.movefast.flota;

/**
 *
 * @author orff_13
 */
public class Furgoneta extends Vehicle {
    
    private int carrega;

    public Furgoneta(String matricula, TipoCarnet tipoCarnet, double preu, int carrega) {
		super(matricula, tipoCarnet, TipusVehicle.FURGONETA, preu);
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
		return "Furgoneta [carrega=" + carrega + "]";
	}

   

}
