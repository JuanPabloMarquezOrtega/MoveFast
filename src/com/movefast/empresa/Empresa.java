package com.movefast.empresa;

import java.util.HashMap;

import com.movefast.client.Leasing;

public class Empresa {
	private String nom;
	private String id;
	private String adre�a;
	private HashMap<String, Leasing> leasings;
	
	public Empresa(String nom, String id, String adre�a) {
		super();
		this.nom = nom;
		this.id = id;
		this.adre�a = adre�a;
		this.leasings = new HashMap<String, Leasing>();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adre�a == null) ? 0 : adre�a.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((leasings == null) ? 0 : leasings.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}
	public void afegirLeasing(Leasing leasing) {
		leasings.put(leasing.getId(), leasing);
	}
	@Override
	public String toString() {
		return "Empresa [nom=" + nom + ", id=" + id + ", adre�a=" + adre�a + ", leasings=" + leasings + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (adre�a == null) {
			if (other.adre�a != null)
				return false;
		} else if (!adre�a.equals(other.adre�a))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (leasings == null) {
			if (other.leasings != null)
				return false;
		} else if (!leasings.equals(other.leasings))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getId() {
		return id;
	}
	public String getAdre�a() {
		return adre�a;
	}
	public void setAdre�a(String adre�a) {
		this.adre�a = adre�a;
	}
	public HashMap<String, Leasing> getLeasings() {
		return leasings;
	}
	
}
