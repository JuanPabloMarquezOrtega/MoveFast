

package com.movefast.flota;

/**
 *
 * @author orff_13
 */
public class Moto extends Vehicle {
    
    private boolean sidecar;

    

    public Moto(String matricula, TipoCarnet tipoCarnet, double preu, boolean sidecar) {
		super(matricula, tipoCarnet, TipusVehicle.MOTO, preu);
		this.sidecar = sidecar;
	}

	public boolean isSidecar() {
        return sidecar;
    }

    public void setSidecar(boolean sidecar) {
        this.sidecar = sidecar;
    }

    @Override
    public String toString() {
        return super.toString() + "Moto{" + "sidecar=" + sidecar + '}';
    }

}
