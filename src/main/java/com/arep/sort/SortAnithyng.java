package com.arep.sort;

public class SortAnithyng {

	
	/**
	 * Método sort para ordenada una lista, encontrado en https://www.geeksforgeeks.org/java-program-for-bubble-sort/ 
	 * @param lista Es la lista a ordenar
	 * @return La lista ordenada
	 */
	public static double[] bubbleSort(double[] lista) {
		int n = lista.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (lista[j] > lista[j + 1]) {
					// swap temp and lista[i]
					double temp = lista[j];
					lista[j] = lista[j + 1];
					lista[j + 1] = temp;
				}
		
		return lista;
	}
}
