package com.interf.test;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author   ID 146857 Sean Thomas Burger Flores
 * @version  1.0
 * @since   03/03/2015
 */
public interface TestRemote extends Remote{
     /**
      * En la interface defino los metodos que el servidor va a implementar
      * cuando los defino pongo el modificador de acceso,parametro de salida el metodo y los parametros ademas de la excepcion remota
      * Aquí uso el serializado del objeto que me va a permitir realizar el marshalling.
      * Tenemos el primer metodo de Test donde si es indentico a test regreso true 
      * Multiplicar que multiplico a y b, regresando el resultado
      * Por ultimo reviso si la palabra es o no es palindromo
      *  **/
	
	public Boolean test(String test) throws RemoteException;
	public int Multiplicar( int a , int b)throws RemoteException;
	public String Palindromo()throws RemoteException;
	
}//End TestRemote
