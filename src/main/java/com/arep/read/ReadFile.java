package com.arep.read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.arep.array.ListaEncadenada;
import com.arep.array.Node;


/**
 * Clase encargada de leer los datos y retornas las distintas listas encadenadas correspondientes
 * @author SebastianPaez
 *
 */
public class ReadFile {
	
	
	/**
	 * Lee un archivo de números (Este se debe pasar como parametro al momento de ejecutar) y lo guarda en una lista encadenada.
	 * @param filePath Es la dirección donde se encuentra el archivo de números a leer.
	 * @return La lista en cadenada creada a partir de los datos del archivo.
	 */
	public static ListaEncadenada leerArchivo(String filePath) {		
		ListaEncadenada lista = new ListaEncadenada();
		
		try {
			File archivo = new File(filePath);
			Scanner sc = new Scanner(archivo);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				double value = Double.parseDouble(line);
				lista.addRight(new Node(value));
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error al leer el archivo.");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;		
	}
	
	
	/**
	 * Lee un string json que contiene la información y retorna la lista con los datos del string.
	 * @param json Es el string a revisar para obtener los datos.
	 * @return La lista encadenada con los datos del string json.
	 */
	public static ListaEncadenada jsonToList(String json) {
		ListaEncadenada lista = new ListaEncadenada();
		String[] jsonList = json.replace("\"", "").replace("]", "").replace("[", "").split(",");
		for (int i = 0; i < jsonList.length; i++) {
			double value = Double.parseDouble(jsonList[i]);
			lista.addRight(new Node(value));
		}
		return lista;		
	}
	
	/**
	 * Lee un string json que contiene la información y retorna la lista con los datos del string.
	 * @param json Es el string a revisar para obtener los datos.
	 * @return La lista en formato String con los datos del string json.
	 */
	public static double[] convertJsonToDoubleList(String json) {
		String[] jsonList = json.replace("\"", "").replace("]", "").replace("[", "").split(",");
		double[] listValores = new double[jsonList.length];
		for (int i = 0; i < jsonList.length; i++) {
			double value = Double.parseDouble(jsonList[i]);
			listValores[i] = value;
		}
		return listValores;
	}
	
}
