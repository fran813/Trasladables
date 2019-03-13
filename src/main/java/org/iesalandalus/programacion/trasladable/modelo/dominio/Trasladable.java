package org.iesalandalus.programacion.trasladable.modelo.dominio;


public interface Trasladable {
	
	void trasladar (double x, double y);
	int hashCode();
	boolean equals(Object object);
	String toString();

}
