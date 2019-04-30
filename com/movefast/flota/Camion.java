

package com.movefast.flota;

/**
 *
 * @author orff_13
 */
public class Camion extends Vehicle {
    
    private int tara;
    private int longitud;
    private int rodes;

    public Camion(int tara, int longitud, int rodes, String matricula, TipoCarnet tipoCarnet, double preu) {
        super(matricula, tipoCarnet, preu);
        this.tara = tara;
        this.longitud = longitud;
        this.rodes = rodes;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getRodes() {
        return rodes;
    }

    public void setRodes(int rodes) {
        this.rodes = rodes;
    }

    @Override
    public String toString() {
        return super.toString() + "Camion{" + "tara=" + tara + ", longitud=" + longitud + ", rodes=" + rodes + '}';
    }

}
