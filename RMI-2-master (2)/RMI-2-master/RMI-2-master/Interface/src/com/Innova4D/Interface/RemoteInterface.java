package com.Innova4D.Interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote {
	
	/*
	 * Defino los m�todos a implementarse en el servidor
	 * 
	 */
	/**
	 * 
	 * @return
	 * @throws RemoteException
	 */
	public Object[][] getMapaPistas()  throws RemoteException;
	
	/*
	 * Metodos del avi�n
	 */
	/**
	 * 
	 * 
	 * @param a
	 * @return
	 * @throws RemoteException
	 */
	public Boolean checkInAvion(Avion a)      throws RemoteException;
	public Avion   getAvion(String id, int c) throws RemoteException;
	public Boolean moverAvion(Avion a, int c) throws RemoteException;
	
	/*
	 * Metodos del auto
	 */
	/**
	 * Registra al auto en la pista.
	 * @param a el auto que se desea hacer checkIn.
	 * @return
	 * @throws RemoteException
	 */
	public Boolean checkInAuto(Auto a)       throws RemoteException;
	public Auto    getAuto(String id, int c) throws RemoteException;
	public Boolean moverAuto(Auto a, int c)  throws RemoteException;
	
	/**Registro el UFO en la pista 
	 * @param el UFO que se desea hacer checkIn.
	 * @return
	 * @throws RemoteException
	 */
	public Boolean checkInUFO(UFO a)       throws RemoteException;
	public UFO   getUFO(String id, int c) throws RemoteException;
	public Boolean moverUFO(UFO a, int c)  throws RemoteException;
	
	/**Registro el Boeing en la pista
	 * @param el Boeing que se desea hacer chekIn.
	 * @return 
	 * @throws RemoteException
	 */
	public Boolean checkInBoeing(Boeing a)       throws RemoteException;
	public Boeing   getBoeing(String id, int c) throws RemoteException;
	public Boolean moverBoeing(Boeing a, int c)  throws RemoteException;
}
