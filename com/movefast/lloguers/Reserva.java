package com.movefast.lloguers;

import java.time.LocalDate;

import com.movefast.client.*;
import com.movefast.exceptions.DataException;
import com.movefast.flota.*;

public class Reserva {
	private Client client;
	private Vehicle vehicle;
	private LocalDate dataReserva;
	private LocalDate dataRecollida;
	private LocalDate dataEntrega;
	private double preu;
	private String targeta;
	private boolean pagat;
	
	
	public Reserva(Client client, Vehicle vehicle, LocalDate dataReserva, LocalDate dataRecollida,
			LocalDate dataEntrega, double preu, String targeta) {
		super();
		this.client = client;
		this.vehicle = vehicle;
		this.dataReserva = dataReserva;
		this.dataRecollida = dataRecollida;
		if(dataRecollida.isBefore(dataEntrega)|| dataRecollida==dataEntrega)
			this.dataEntrega = dataEntrega;
		else
			try {
				throw new DataException("La data de recollida ha de ser igual o anterior a la data d'entrega! ");
			} catch (DataException e) {
				System.err.println(e.getMessage());
			}
		if("Leasing".equals(client.getClass()))
			this.preu = preu-preu*0.1;
		else 
			this.preu=preu;
		this.targeta = targeta;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public LocalDate getDataRecollida() {
		return dataRecollida;
	}
	public void setDataRecollida(LocalDate dataRecollida) {
		this.dataRecollida = dataRecollida;
	}
	public LocalDate getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public double getPreu() {
		return preu;
	}
	public void setPreu(double preu) {
		this.preu = preu;
	}
	public Client getClient() {
		return client;
	}
	public LocalDate getDataReserva() {
		return dataReserva;
	}
	public String getTargeta() {
		return targeta;
	}
}
