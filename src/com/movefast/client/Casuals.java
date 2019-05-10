package com.movefast.client;

import java.util.ArrayList;

public class Casuals extends Client {
	private Targeta targeta;
    
    
	public Casuals(String id, String nom, Targeta targeta) {
		super(id, nom, TipusClient.CASUAL);
		this.targeta = targeta;
	}

	public Targeta getTargeta() {
		return targeta;
	}

	@Override
	public String toString() {
		return "Casuals [targeta=" + targeta + "]";
	}
    

	
    

}
