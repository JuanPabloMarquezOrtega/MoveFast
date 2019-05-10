package com.movefast.client;

import java.util.ArrayList;

public class Leasing extends Client {
    private String compteBancari;

	public Leasing(String id, String nom, String compteBancari) {
		super(id, nom,  TipusClient.LEASING);
		this.compteBancari = compteBancari;
	}

	@Override
	public String toString() {
		return "Leasing [compteBancari=" + compteBancari + "]";
	}

	public String getCompteBancari() {
		return compteBancari;
	}
    
}