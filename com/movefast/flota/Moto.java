

package com.movefast.flota;

/**
 *
 * @author orff_13
 */
public class Moto extends Vehicle {
    
    private boolean sidecar;

    public Moto(boolean sidecar, String matricula, TipoCarnet tipoCarnet, double preu) {
        super(matricula, tipoCarnet, preu);
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
