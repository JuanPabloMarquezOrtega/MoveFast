

package com.movefast.flota;

/**
 *
 * @author orff_13
 */
public class Cotxe extends Vehicle {
    
    private int portes;
    private int capacitat;

    public Cotxe(int portes, int capacitat, String matricula, TipoCarnet tipoCarnet, double preu) {
        super(matricula, tipoCarnet, preu);
        this.portes = portes;
        this.capacitat = capacitat;
    }

    public int getPortes() {
        return portes;
    }

    public void setPortes(int portes) {
        this.portes = portes;
    }

    public int getCapacitat() {
        return capacitat;
    }

    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }

    @Override
    public String toString() {
        return super.toString() + "Cotxe{" + "portes=" + portes + ", capacitat=" + capacitat + '}';
    }

}
