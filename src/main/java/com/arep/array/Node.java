package com.arep.array;

/**
 * Clase nodo que servirá para la lista encadenada
 * @author SebastianPaez
 *
 */
public class Node {
	
	private double value;
	private Node left;
	private Node right;
	
	
	/**
	 * Contructor del nodo.
	 * @param value Es el valor que se le quiere dar al nodo.
	 * @param left Es el apuntador a la izquierda del nodo.
	 * @param right Es el apuntador a la derecha del nodo.
	 */
	public Node (double value, Node left, Node right) {
		this.setValue(value);
		this.setLeft(left);
		this.setRight(right);	
	}
	
	/**
	 * Contructor del nodo.
	 * @param value Es el valor que se le quiere dar al nodo.
	 */
	public Node (double value) {
		this.setValue(value);
	}
	
	
	/**
	 * Retorna el valor del nodo.
	 * @return value Que es el valor actual del nodo.
	 */
	public double getValue() {
		return value;
	}

	/**
	 * Cambia el valor del nodo.
	 * @param value Es el valor que se quiere establecer en el nodo.
	 */
	public void setValue(double value) {
		this.value = value;
	}

	/**
	 * Obtiene el apuntador a la izquierda del nodo que puede ser null en caso de no tener ningun nodo a su izquierda.
	 * @return left Que es el apuntador a la izquierda del nodo.
	 */
	public Node getLeft() {
		return left;
	}

	/**
	 * Cambia el apuntador izquierdo del nodo a uno que queremos establecer-
	 * @param left Es el nuevo nodo al cual queremos que apunte el nodo actual.
	 */
	public void setLeft(Node left) {
		this.left = left;
	}

	/**
     * Obtiene el apuntador a la derecha del nodo que puede ser null en caso de no tener ningun nodo a su derecha.
	 * @return right Que es el apuntador a la derecha del nodo.
	 */
	public Node getRight() {
		return right;
	}

	/**
	 * Cambia el apuntador derecho del nodo a uno que queremos establecer-
	 * @param right Es el nuevo nodo al cual queremos que apunte el nodo actual.
	 */
	public void setRight(Node right) {
		this.right = right;
	}	
	
	/**
	 * Método que retorna una forma de visualizar el valor del nodo.
	 */
	@Override
	public String toString() {
		return String.valueOf(value);
	}
	
	/**
	 * Compara si el objeto enviado es igual al nodo actual. 
	 */
	@Override
	public boolean equals(Object obj) {
	    return (this == obj);
	}
}

