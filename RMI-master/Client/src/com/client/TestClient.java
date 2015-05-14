package com.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import com.interf.test.TestRemote;

/**
 * @author ID 146857  Sean Thomas Burger Flores
 * @version  1.O
 * @since    03/03/2015
 */
public class TestClient {

	public static final String RMI_ID = "TestRMI";
	/**
	 * Define el puerto en donde se encuentra el servidor.
	 */
	public static final int RMI_PORT = 8080;
/**
 * Aquí invoco los métodos en el método main del ejercicio primero consiguiendo el host para conectarse
 *  despues llamo al TestRemotre para que me "registre" es decir me pueda yo conectar al servidor
 *  Por medio de impresiones mando al servidor las peteciones, en al principio son 1,2,3 y test regresando false y true
 *  Luego multiplica dos numeros y por último  me dice si la palabra que puse en el servidor es o no es un palindromo.
 *  **/
	public static void main(String[] args) throws RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry("localhost", RMI_PORT);
		TestRemote remote = (TestRemote) registry.lookup(RMI_ID);
		System.out.println(remote.test("123"));
		System.out.println(remote.test("test"));
		System.out.println(remote.Multiplicar(1,2));
		System.out.println(remote.Palindromo());
	}//End main

}//End TestClient
