

package com.movefast.flota;

/**
 *
 * @author orff_13
 */
public class Cotxe extends Vehicle {
    
    private int portes;
    private int capacitat;
    private boolean aire;

    
    public Cotxe(String matricula, TipoCarnet tipoCarnet, double preu, int portes, int capacitat,
			boolean aire) {
		super(matricula, tipoCarnet, TipusVehicle.COTXE, preu);
		this.portes = portes;
		this.capacitat = capacitat;
		this.aire = aire;
	}
    
	public boolean isAire() {
		return aire;
	}

	public int getPortes() {
        return portes;
    }
    public int getCapacitat() {
        return capacitat;
    }

    @Override
    public String toString() {
        return super.toString() + "Cotxe{" + "portes=" + portes + ", capacitat=" + capacitat + '}';
    }

}
