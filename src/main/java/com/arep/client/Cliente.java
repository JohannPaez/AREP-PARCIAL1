package com.arep.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Cliente {
	
	
	/**
	 * Cliente encargado de realizar una petición POST al servidor de heroku y muestra la infomación enviada por el servidor
	 * @param args Son los parametros al momento de ejecutar
	 */
	public static void main(String[] args) {
		try {
			URL url = new URL("https://guarded-mountain-62231.herokuapp.com/operation");
			HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
			conexion.setRequestMethod("POST");
			conexion.setDoOutput(true);
			String listaString = "97.92,36.98,85.02,25.42,97.37,84.61,65.95,67.42,68.53,85.15,36.28,36.49,75.78,17.18,36.67";
			OutputStream os = conexion.getOutputStream();
			byte[] line = listaString.getBytes("utf-8");
			os.write(line, 0, line.length);
			BufferedReader buffererReader = new BufferedReader(new InputStreamReader(conexion.getInputStream(), "utf-8"));
			StringBuilder res = new StringBuilder();
			String linea = null;
			while ((linea = buffererReader.readLine()) != null) {
				res.append(linea.trim());
			}
			System.out.println("La lista quemada es: \n[" + listaString+"]");
			System.out.println("El JSON OBTENIDO ES: \n" + res.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
