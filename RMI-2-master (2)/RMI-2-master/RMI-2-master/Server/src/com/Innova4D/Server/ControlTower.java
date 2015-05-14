package com.Innova4D.Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.Innova4D.Interface.Auto;
import com.Innova4D.Interface.Avion;
import com.Innova4D.Interface.RemoteInterface;
import com.Innova4D.Interface.UFO;
import com.Innova4D.Interface.Boeing;

public class ControlTower extends UnicastRemoteObject implements RemoteInterface {
	
	/* protejo el constructor para asegurar la seguridad de la ControlTower
	 * Es accesible para esta clase y sus subclases
	 */
	protected ControlTower() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * { 0, 0, 0, 0, 0, 0, 0, 0 },
	 * { 0, 0, 0, 0, 0, 0, 0, 0 },
	 * { 0, 0, 0, 0, 0, 0, 0, 0 },
	 * { 0, 0, 0, 0, 0, 0, 0, 0 }
	 */	
	private Object[][] mapaPista = new Object[4][8];

	private static final long serialVersionUID = 1L;

	/**Retorno el mapa de las pistas
 	* 
 	*/
	@Override
	public Object[][] getMapaPistas() throws RemoteException {
		return this.mapaPista;
	}
	
	/**Voy moviendo el avion en la matriz, un bloque a la vez. de izquierda a derecha.
	 * @param a la referencia a mis objetos de clase avion
	 * @param El carril donde se encuentra el objeto.
	 * @throws RemoteException
	 */
	@Override
	public Boolean moverAvion(Avion a, int c) throws RemoteException {
		Boolean flag = false;
		int newY = a.getY() + 1;
		if (newY < 8) {
		try {
				this.mapaPista[c][a.getY()] = null;
				this.mapaPista[c][newY] = a;
				a.setX(0);
				a.setY(newY);
				flag = true;
			} catch (Exception e) {
				flag = false;
			}
		}
		return flag;
	}
	
  /**
   * Busco un avion en el mapa aereo segun su ID.
 	* 
 	* @param id El identificador del objeto.
 	* @param c  El carril donde se encuentra el objeto.
 	*/
	@Override
	public Avion getAvion(String id, int c) throws RemoteException {
		Avion a = null;
		for (int i = 0; i < 8; i++) {
		    if(this.mapaPista[c][i] != null){
		    	a = (Avion) this.mapaPista[c][i];
		    	if(!a.getId().equals(id))
		    		a = null;
		    }
		}
		return a;
	}

	@Override
	public Boolean checkInAvion(Avion a) throws RemoteException {
		if(this.mapaPista[a.getX()][a.getY()] == null)
			this.mapaPista[a.getX()][a.getY()] = a;
		return true;
	}

	/*
	 * Los metodos del auto. Es lo mismo que el avión pero para el auto.
	 */
	
	@Override
	/**@param a el auto a registrar
	 * @return
	 * @throws RemoteException
	 */
	public Boolean checkInAuto(Auto a) throws RemoteException {
		if(this.mapaPista[a.getX()][a.getY()] == null)
			this.mapaPista[a.getX()][a.getY()] = a;
		return true;
	}
	@Override
	/**
	 * Busco un Auto en el mapa aereo segund su ID.
 	* @param id El identificador del objeto.
 	* @param c  El carril donde se encuentra el objeto.
	 */
	public Auto getAuto(String id, int c) throws RemoteException {
		Auto a = null;
		for (int i = 0; i < 8; i++) {
		    if(this.mapaPista[c][i] != null){
		    	a = (Auto) this.mapaPista[c][i];
		    	if(!a.getId().equals(id))
		    		a = null;
		    }
		}
		return a;
	}

	@Override
	/**Voy moviendo el auto en la matriz, un bloque a la vez. de izquierda a derecha.
	 * @param a la referencia a mis objetos de clase Auto
	 * @param El carril donde se encuentra el objeto.
	 * @throws RemoteException
	 */
	public Boolean moverAuto(Auto a, int c) throws RemoteException {
		Boolean flag = false;
		int newY = a.getY() + 1;
		if (newY < 8) {
		try {
				this.mapaPista[c][a.getY()] = null;
				this.mapaPista[c][newY] = a;
				a.setX(0);
				a.setY(newY);
				flag = true;
			} catch (Exception e) {
				flag = false;
			}
		}
		return flag;
	}
	/**
	 * Los metodos del UFO
	 */
	@Override
	
	/**@param a el UFO a registrar
	 * @return
	 * @throws RemoteException
	 */
	public Boolean checkInUFO(UFO a) throws RemoteException {
		if(this.mapaPista[a.getX()][a.getY()] == null)
			this.mapaPista[a.getX()][a.getY()] = a;
		return true;
	}
	@Override
	/**
	 * Busco un UFO en el mapa aereo segund su ID.
 	* @param id El identificador del objeto.
 	* @param c  El carril donde se encuentra el objeto.
	 */
	public UFO getUFO(String id, int c) throws RemoteException {
		UFO a = null;
		for (int i = 0; i < 8; i++) {
		    if(this.mapaPista[c][i] != null){
		    	a = (UFO) this.mapaPista[c][i];
		    	if(!a.getId().equals(id))
		    		a = null;
		    }
		}
		return a;
	}

	@Override
	/**Voy moviendo el UFO en la matriz, un bloque a la vez. de izquierda a derecha.
	 * @param a la referencia a mis objetos de clase Auto
	 * @param El carril donde se encuentra el objeto.
	 * @throws RemoteException
	 */
	public Boolean moverUFO(UFO a, int c) throws RemoteException {
		Boolean flag = false;
		int newY = a.getY() + 1;
		if (newY < 8) {
		try {
				this.mapaPista[c][a.getY()] = null;
				this.mapaPista[c][newY] = a;
				a.setX(0);
				a.setY(newY);
				flag = true;
			} catch (Exception e) {
				flag = false;
			}
		}
		return flag;
	}

	
	
	/**
	 * Los metodos del Boeing
	 */
	
	@Override
	/**@param a el Boeing a registrar
	 * @return
	 * @throws RemoteException
	 */
	
 public Boolean checkInBoeing(Boeing a) throws RemoteException {
		if(this.mapaPista[a.getX()][a.getY()] == null)
			this.mapaPista[a.getX()][a.getY()] = a;
		return true;
	}
	@Override
	/**
	 * Busco un Boeing en el mapa aereo segund su ID.
 	* @param id El identificador del objeto.
 	* @param c  El carril donde se encuentra el objeto.
	 */
	
	
	public Boeing getBoeing(String id, int c) throws RemoteException {
		Boeing a = null;
		for (int i = 0; i < 8; i++) {
		    if(this.mapaPista[c][i] != null){
		    	a = (Boeing) this.mapaPista[c][i];
		    	if(!a.getId().equals(id))
		    		a = null;
		    }
		}
		return a;
	}

	@Override
	
	/**Voy moviendo el Boeing en la matriz, un bloque a la vez. de izquierda a derecha.
	 * @param a la referencia a mis objetos de clase Auto
	 * @param El carril donde se encuentra el objeto.
	 * @throws RemoteException
	 */
	
	public Boolean moverBoeing(Boeing a, int c) throws RemoteException {
		Boolean flag = false;
		int newY = a.getY() + 1;
		if (newY < 8) {
		try {
				this.mapaPista[c][a.getY()] = null;
				this.mapaPista[c][newY] = a;
				a.setX(0);
				a.setY(newY);
				flag = true;
			} catch (Exception e) {
				flag = false;
			}
		}
		return flag;
	}

}
