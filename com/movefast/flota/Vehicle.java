

package com.movefast.flota;

/**
 *
 * @author orff_13
 */
public abstract class Vehicle {
    
    protected String matricula;
    protected TipoCarnet tipoCarnet;
    protected double preu;

    public Vehicle(String matricula, TipoCarnet tipoCarnet, double preu) {
        this.matricula = matricula;
        this.tipoCarnet = tipoCarnet;
        if(preu > 0){
            this.preu = preu;
        }else{
            this.preu = 0;
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public TipoCarnet getTipoCarnet() {
        return tipoCarnet;
    }

    public void setTipoCarnet(TipoCarnet tipoCarnet) {
        this.tipoCarnet = tipoCarnet;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "matricula=" + matricula + ", tipoCarnet=" + tipoCarnet + ", preu=" + preu + '}';
    }
      
}
