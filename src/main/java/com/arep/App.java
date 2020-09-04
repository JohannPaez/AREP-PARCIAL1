package com.arep;


import static spark.Spark.*;

import com.arep.array.ListaEncadenada;
import com.arep.operation.Calculator;
import com.arep.read.ReadFile;
import com.arep.services.ServicesHttp;
import com.arep.sort.SortAnithyng;

/**
 * Aplicaci�n que lee n valores de un archivo y calcula la media y la desviaci�n est�ndar
 * redondeado a 2 decimales, respondiendo con peticiones http usando SPARK.
 * 
 * @author SebastianPaez
 *
 */
public class App {
	
	
	/**
	 * Ejecuta la aplicaci�n para poder utilizar los servicios
	 * @param args Son los parametros al momento de ejecutar.
	 */
	public static void main(String[] args) {
		port(getPort());
		staticFiles.location("/public");
		post("/operation", (request, response) -> {
			System.out.println("REQUEST BODY \n" + request.body());
			ListaEncadenada lista = ReadFile.jsonToList(request.body());
			Calculator c = new Calculator(lista);
			double[] doubleList = ReadFile.convertJsonToDoubleList(request.body());
			System.out.println("ESTE ES LO QUE ES LA LSITA DOUBLE LIST \n" + doubleList);			
			String json = ServicesHttp.jsonToString(c.getMedia(), c.getSumatoria(), SortAnithyng.bubbleSort(doubleList));
			System.out.println("JSON FINAL "  + json);
			return json;
		});
	}
	
	/**
	 * Funcion que retorna el n�mero del puerto por el cual se correr� el servicio.
	 * @return El n�mero de puerto del servicio.
	 */
	static int getPort() {
		 if (System.getenv("PORT") != null) {
			 return Integer.parseInt(System.getenv("PORT"));
		 }
		 	return 4567;
	}
	
}