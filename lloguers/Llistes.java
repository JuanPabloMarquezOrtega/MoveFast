package com.movefast.lloguers;

import java.util.HashMap;
import com.movefast.client.*;
import com.movefast.exceptions.DataException;
import com.movefast.exceptions.MovefastException;
import com.movefast.flota.*;

public class Llistes {
	private HashMap<String,Vehicle> vehicles;
	private HashMap<String,Client> clients;
	private HashMap<String,Empresa> empreses;
	public Llistes() {
		this.vehicles = null;
		this.clients = null;
		this.empreses = null;
	}
	public void afageixVehicle(Vehicle vehicle) {
		if(vehicles.containsKey(vehicle.getMatricula())==false)
			vehicles.put(vehicle.getMatricula(), vehicle);
		else
			try {
				throw new MovefastException("El valor ja existeix");
			} catch (MovefastException e) {
				System.err.println(e.getMessage());
			}
			
	}
	public void esborraVehicle(Vehicle vehicle) {
		if(vehicles.containsKey(vehicle.getMatricula())==true)
			vehicles.remove(vehicle.getMatricula());
		else
			try {
				throw new MovefastException("El valor no existeix");
			} catch (MovefastException e) {
				System.err.println(e.getMessage());
			}
			
	}
	public int quantitatVehicles() {
		return vehicles.size();
	}
	public void afageixClient(Client client) {
		if(clients.containsKey(client.getDni())==false)
			clients.put(client.getDni(), client);
		else
			try {
				throw new MovefastException("El valor ja existeix");
			} catch (MovefastException e) {
				System.err.println(e.getMessage());
			}
			
	}
	public void esborraClient(Client client) {
		if(clients.containsKey(client.getDni())==true)
			clients.remove(client.getDni());
		else
			try {
				throw new MovefastException("El valor no existeix");
			} catch (MovefastException e) {
				System.err.println(e.getMessage());
			}
			
	}
	public int quantitatClients() {
		return clients.size();
	}
	public void afageixEmpresa(Empresa empresa) {
		if(empreses.containsKey(empresa.getCif())==false)
			empreses.put(empresa.getCif(), empresa);
		else
			try {
				throw new MovefastException("El valor ja existeix");
			} catch (MovefastException e) {
				System.err.println(e.getMessage());
			}
			
	}
	public void esborraEmpresa(Empresa empresa) {
		if(empreses.containsKey(empresa.getCif())==true)
			empreses.remove(empresa.getCif(), empresa);
		else
			try {
				throw new MovefastException("El valor no existeix");
			} catch (MovefastException e) {
				System.err.println(e.getMessage());
			}
			
	}
	public int quantitatEmpresa() {
		return empreses.size();
	}
}
