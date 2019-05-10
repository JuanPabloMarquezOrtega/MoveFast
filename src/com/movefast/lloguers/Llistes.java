package com.movefast.lloguers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import com.movefast.client.*;
import com.movefast.exceptions.DataException;
import com.movefast.exceptions.MovefastException;
import com.movefast.flota.*;

public class Llistes {
	private HashMap<String, Vehicle> vehicles;
	private HashMap<String, Client> clients;
	private HashSet<Empresa> empreses;
	private ArrayList<Reserva> reserves;

	public Llistes() {
		super();
		this.vehicles = new HashMap<String, Vehicle>();
		this.clients = new HashMap<String, Client>();
		this.empreses = new HashSet<Empresa>();
		this.reserves = new ArrayList<Reserva>();
	}
	
	public HashMap<String, Vehicle> getVehicles() {
		return vehicles;
	}
	
	public ArrayList<Reserva> cercarLloguerVehicle(Vehicle vehicle){
		ArrayList<Reserva> llista = new ArrayList<Reserva>();
		for(Reserva a:reserves) {
			if(a.getVehicle()==vehicle) {
				llista.add(a);
			}
		}
		return llista;
	}
	public boolean vehicleDisponible(LocalDate inici, LocalDate fi, Vehicle vehicle) throws DataException {
		if(inici.isAfter(fi))
			throw new DataException("La data d'inici ha de ser anterior a la de fi.");
		ArrayList<Reserva> llista = cercarLloguerVehicle(vehicle);
		Boolean i = true;
		for(Reserva a: llista) {
			if((inici.isBefore(a.getDataRecollida()) && fi.isBefore(a.getDataRecollida())) || (inici.isAfter(a.getDataEntrega()) && fi.isAfter(a.getDataEntrega()))) {
				return true;
			}
		}
		return false;
		
	}
	
	public void afageixVehicle(Vehicle vehicle) throws MovefastException {
		if (vehicles.containsKey(vehicle.getMatricula()) == false)
			vehicles.put(vehicle.getMatricula(), vehicle);
		else
			throw new MovefastException("El valor ja existeix");
	}

	public void esborraVehicle(String vehicle) throws MovefastException {
		if (vehicles.containsKey(vehicle) == true)
			vehicles.remove(vehicle);
		else
			throw new MovefastException("El valor no existeix");
	}
	public Vehicle recuperaVehicle(String vehicle) throws MovefastException {
		if (vehicles.containsKey(vehicle) == true)
			return vehicles.get(vehicle);
		else
			throw new MovefastException("El valor ja existeix");
	}
	
	public int quantitatVehicles() {
		return vehicles.size();
	}

	public void afageixClient(Client client) throws MovefastException {
		if (clients.containsKey(client.getId()) == false)
			clients.put(client.getId(), client);
		else
			throw new MovefastException("El valor ja existeix");

	}
	public void afageixClient(Client client,Empresa empresa) throws MovefastException {
		if (clients.containsKey(client.getId()) == false && empreses.contains(empresa)==false) {
				clients.put(client.getId(), client);
				afageixEmpresa(empresa);
			
		}else
			throw new MovefastException("El valor ja existeix");
	}

	public void esborraClient(String client) throws MovefastException {
		if (clients.containsKey(client) == true)
			clients.remove(client);
		else
			throw new MovefastException("El valor no existeix");
	}
	public Client recuperaClient(String client) throws MovefastException {
		if (clients.containsKey(client) == true)
			return clients.get(client);
		else
			throw new MovefastException("El valor ja existeix");
	}

	public int quantitatClients() {
		return clients.size();
	}

	public void afageixEmpresa(Empresa empresa) throws MovefastException {
		if (empreses.contains(empresa) == false)
			empreses.add(empresa);
		else
			throw new MovefastException("El valor ja existeix");
	}

	public void esborraEmpresa(Empresa empresa) throws MovefastException {
		if (empreses.contains(empresa) == true)
			empreses.remove(empresa);
		else
			throw new MovefastException("El valor no existeix");
	}

	public int quantitatEmpresa() {
		return empreses.size();
	}
}
