package com.movefast.client;

import java.util.ArrayList;

public abstract class Client {
    private String id;
    private String nom;
    private ArrayList<TipusCarnet> carnets;
    private TipusClient tipus;
    
	public Client(String id, String nom, TipusClient tipus) {
		super();
		this.id = id;
		this.nom = nom;
		this.carnets = new ArrayList<TipusCarnet>();
		this.tipus = tipus;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public ArrayList<TipusCarnet> getCarnets() {
		return carnets;
	}
	public void setCarnets(ArrayList<TipusCarnet> carnets) {
		this.carnets = carnets;
	}
	public TipusClient getTipus() {
		return tipus;
	}
    
}
