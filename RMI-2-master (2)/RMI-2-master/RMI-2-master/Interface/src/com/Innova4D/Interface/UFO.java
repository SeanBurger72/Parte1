package com.Innova4D.Interface;

import java.io.Serializable;
import java.rmi.RemoteException;

/**
 * 
 * @author Sean Thomas Burger Flores ID 146857
 * Los aviones forman parte de la interfaz,
 * por esto es importante declarar los objetos dentro del mismo paquete.
 * Aquí vamos a hacer uso del Marshalling, en esencia una serializacion de objetos
 * Queriendo decir que grabamos el estado de un objeto y su codebase.
 * Cuando lo "UnMarshalled" el objeto se mantiene
 * 
 */
public class UFO implements Serializable {
	
	/**
	 * Serial Unique ID 
	 */
	private static final long serialVersionUID = 36L;

	private int x;
	private int y;
	private String id;
	
	public UFO(String id, int x, int y) throws RemoteException {
		super();
		this.id = id;
		this.setX(x);
		this.setY(y);
	}

	public String getId() throws RemoteException  {
		return id;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
