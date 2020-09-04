package com.arep.array;

import com.arep.exceptions.AppException;
/**
 * Lista encadenada que utilizara nodos para poder realizar las operaciones b�sicas
 * @author SebastianPaez
 *
 */
public class ListaEncadenada {
	private int len = 0;
	private Node last;
	private Node first;
	
	/**
	 * Constructor de la lista encadenada, al comienzo es vacia.
	 */
	public ListaEncadenada() {
		
	}
	
	/**
	 * A�ade un nuevo nodo a la derecha de la lista.
	 * @param nodo Es el nuevo nodo a a�adir.
	 */
	public void addRight(Node nodo) {
		if (len == 0) {
			last = nodo;
			first = nodo;
		} else {
			last.setRight(nodo);
			nodo.setLeft(last);
			last = nodo;
		}
		len++;
	}
	
	/**
	 * Elimina el �ltimo nodo de la derecha.
	 * @return El nodo eliminado de la lista encadenada.
	 * @throws AppException Lanz� una expceci�n en caso de que no se pueda eliminar de la lista encadenada.
	 */
	public Node popRight() throws AppException {
		if (last == null) throw new AppException(AppException.POP_VACIO);
		Node nodo = last;
		if (first.equals(last)) first = last = null;
		else {
			Node penultimo = last.getLeft();
			penultimo.setRight(null);
			last = penultimo;
		}
		len--;
		return nodo;
	}
	
	/**
	 * A�ade un nuevo nodo a la izquierda de la lista.
	 * @param nodo Es el nuevo nodo a a�adir.
	 */
	public void addLeft(Node nodo) {
		if (len == 0) {
			last = nodo;
			first = nodo;
		} else {
			first.setLeft(nodo);
			nodo.setRight(first);
			first = nodo;
		}
		len++;
	}
	
	/**
	 * Elimina el primer nodo de la lista o elimina por izquierda.
	 * @return El nodo eliminado de la lista encadenada.
	 * @throws AppException Lanz� una expceci�n en caso de que no se pueda eliminar de la lista encadenada.
	 */
	public Node popLeft() throws AppException {
		if (first == null) throw new AppException(AppException.POP_VACIO);
		Node nodo = first;
		if (first.equals(last)) first = last = null;
		else {
			Node segundo = first.getRight();
			first = segundo;
			segundo.setLeft(null);
		}
		len--;
		return nodo;
	}
	
	/**
	 * Retorna el nodo dado su indice en la lista.
	 * @param index Es el indice solicitado.
	 * @return El nodo de la lista en la posici�n i Lista[i].
	 * @throws AppException Lanz� una excepci�n en caso de que la lista este vacia o el �ndice este fuera de rango.
	 */
	public Node get(int index) throws AppException {
		Node nodo = null;
		if (isEmpty()) throw new AppException(AppException.LISTA_VACIA);
		else if (index > len - 1 || index < 0) throw new AppException(AppException.FUERA_RANGO);
		else if (index == 0) {
			nodo = first;
		} else if (index == len - 1) {
			nodo = last;
		} else {			
			nodo = first;
			for (int i = 0; i < index; i++) {
				nodo = nodo.getRight();
			}
		}		
		
		return nodo;
	}
	
	/**
	 * Retorna el tama�o de la lista encadenada.
	 * @return len Que es el tama�o de la lista.
	 */
	public int size() {
		return len;
	}
	
	/**
	 * Dice si la lista est� vacia o no.
	 * @return true, false dependiendo de la condici�n.
	 */
	public boolean isEmpty() {
		return len == 0;
	}
	
	/**
	 * Obtiene el primer nodo de la lista.
	 * @return first que es el primer nodo de la lista.
	 */
	public Node getFirst() {
		return first;
	}
	
	/**
	 * Obtiene el �ltimo nodo de la lista.
	 * @return last que es el �ltimo nodo de la lista.
	 */
	public Node getLast() {
		return last;
	}

	/**
	 * Permite visualizar la lista encadenada de una manera agradable para ver el valor de todos los nodos.
	 */
	@Override
	public String toString() {
		String string = "{";
		Node nodo = first;
		for (int i = 0; i < len; i++) {		
			if (i == len - 1) {
				string += nodo.toString();
				break;
			}
			string += nodo.toString() + ", ";
			nodo = nodo.getRight();
		}
		string += "}";
		return string;
	}
	 
}
