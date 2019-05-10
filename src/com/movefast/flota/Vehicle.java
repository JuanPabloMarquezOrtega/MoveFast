

package com.movefast.flota;

/**
 *
 * @author orff_13
 */
public abstract class Vehicle {
    
    private String matricula;
    private TipoCarnet tipoCarnet;
    private TipusVehicle tipus;
    private double preu;
    

	public Vehicle(String matricula, TipoCarnet tipoCarnet, TipusVehicle tipus, double preu) {
		super();
		this.matricula = matricula;
		this.tipoCarnet = tipoCarnet;
		this.tipus = tipus;
		this.preu = preu;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preu);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((tipoCarnet == null) ? 0 : tipoCarnet.hashCode());
		result = prime * result + ((tipus == null) ? 0 : tipus.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (Double.doubleToLongBits(preu) != Double.doubleToLongBits(other.preu))
			return false;
		if (tipoCarnet != other.tipoCarnet)
			return false;
		if (tipus != other.tipus)
			return false;
		return true;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}

	public TipoCarnet getTipoCarnet() {
		return tipoCarnet;
	}

	public TipusVehicle getTipus() {
		return tipus;
	}

    
      
}
