package org.iesalandalus.programacion.trasladable.modelo.dao;

import java.util.ArrayList;
import java.util.List;
import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.trasladable.modelo.dominio.Trasladable;

public class Trasladables {
	
	private static final String  NOMBRE_FICHERO_TRASLADABLES = "";
	
	private List<Trasladable> coleccionTrasladables;
	
	public Trasladables() {
		
		coleccionTrasladables = new ArrayList<>();
		
	}
	
	public Trasladables (Trasladables trasladables) {
		
		setTrasladables(trasladables);
	}
	
	private void setTrasladables(Trasladables trasladables) {
		
		if (trasladables == null) {
			throw new IllegalArgumentException("No se pueden copiar trasladables nulos.");
		}
		coleccionTrasladables = copiaProfundaTrasladables(trasladables.coleccionTrasladables);
	}
	
	private List<Trasladable> copiaProfundaTrasladables(List<Trasladable> trasladables){
		
		List<Trasladable> otrosTrasladables = new ArrayList<>();
		for (Trasladable trasladable : trasladables) {
			otrosTrasladables.add(new Trasladable(trasladable));
		}
		return otrosTrasladables;
	}
	
	public List<Trasladable> getTrasladables(){
		
		return copiaProfundaTrasladables(coleccionTrasladables);
	}
	
	public void insertar(Trasladable trasladable) {
		
		if (trasladable == null) {
			throw new IllegalArgumentException("No se puede insertar un trasladable nulo.");
		}
		if (coleccionTrasladables.contains(trasladable)) {
			throw new OperationNotSupportedException("El trasladable ya existe.");
		} else {
			coleccionTrasladables.add(new Trasladable(trasladable));
		}
	}
	
	public List<String> representar() {

		List<String> representacion = new ArrayList<>();
		for (Trasladar trasladar : coleccionTrasladables) {
			representacion.add(trasladar.toString());
		}
		return representacion;
	}

}
