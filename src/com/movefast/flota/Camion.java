

package com.movefast.flota;

/**
 *
 * @author orff_13
 */
public class Camion extends Vehicle {
    
    private int tara;
    private int rodes;
    
	public Camion(String matricula, TipoCarnet tipoCarnet, double preu, int tara, int rodes) {
		super(matricula, tipoCarnet, TipusVehicle.CAMION, preu);
		this.tara = tara;
		this.rodes = rodes;
	}
	public int getTara() {
		return tara;
	}
	public void setTara(int tara) {
		this.tara = tara;
	}
	public int getRodes() {
		return rodes;
	}
	public void setRodes(int rodes) {
		this.rodes = rodes;
	}
    
}
