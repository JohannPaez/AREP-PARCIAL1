
package com.arep.services;

import java.util.HashMap;

import com.google.gson.Gson;

public class ServicesHttp {
	
	
	
	/**
	 * Retorna el json de los datos dados abajo
	 * @param promedio Es el promedio de los datos
	 * @param sumatoria Es la sumatoria de los datos
	 * @param listaOrdenada Es la lista ordenada
	 * @return Un String con el json
	 */
	public static String jsonToString(double promedio, double sumatoria, double[] listaOrdenada) {
		HashMap<String, Object> foo = new HashMap<String, Object>();
		foo.put("promedio", promedio);
		foo.put("sumatoria", sumatoria);
		foo.put("listaOrdenada", listaOrdenada);
		String json = new Gson().toJson(foo);					
		return json;
	}
}
