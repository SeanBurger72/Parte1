package com.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.interf.test.TestRemote;

/**
 * @author   ID 146857 Sean Thomas Burger Flores
 * @version  1.0
 * @since    03/03/2015
 */
public class ServerDefinition extends UnicastRemoteObject implements TestRemote {

	/**Aquí tengo un identificador unico de la serializacion
	 * 
	 */
	private static final long serialVersionUID = 1L;
//My server usa una excepcion remota 
	protected ServerDefinition() throws RemoteException {
		super();
	}//End constructor
/**Este metodo marca true si el cliente imprime test pero si es diferente marca false
 *  **/
	public Boolean test(String test) throws RemoteException {
		if(test.equalsIgnoreCase("test")) return true;
		return false;
	} //End Test
	/** El metodo Multiplicar recibe un primer numero y un segundo numero y los multiplica
	 * 
	 * **/
	public int Multiplicar(int primernumero,int segundonumero )throws RemoteException {
		
		
		 return primernumero*segundonumero;
		
	}//End Multiplicar
  public String Palindromo()throws RemoteException {
	  String palabra = "ana";
      
      // Si queremos saber si es palíndromo una frase
      // deberemos de borrar los espacios
      // palabra = palabra.replace(" ", "");
      
      int inc = 0;
      int des = palabra.length()-1;
      boolean error = false;         
      
      while ((inc<des) && (!error)){
              
              if (palabra.charAt(inc)==palabra.charAt(des)){                                
                      inc++;
                      des--;
              } else {
                      error = true;
              }               
      }
      
      if (!error)
              System.out.println(palabra + " es un PALINDROMO");
      else
              System.out.println(palabra + " NO es un palindromo");
      return palabra;
  }//End Palindromo
}//End ServerDefinition
