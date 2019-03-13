package org.iesalandalus.programacion.trasladable.modelo.dominio;

public class Circunferencia {
	
	private Punto centro;
	private double radio;
	
	public Circunferencia (Punto centro, double radio) {
		
		setCentro(centro);
		setRadio(radio);
	}
	
	public Circunferencia (Circunferencia circunferencia) {
		
		if (circunferencia == null) {
			throw new NullPointerException("No puedo copiar una circunferencia nula.");
		}
		setCentro(circunferencia.getCentro());
		setRadio(circunferencia.getRadio());
	}
	
	private void setCentro(Punto centro) {
		
		if (centro == null) {
			throw new NullPointerException("No puedo copiar un centro nulo.");
		}
		this.centro = new Punto(centro);
	}
	
	private void setRadio(double radio	) {
		this.radio = radio;
		
	}
	
	public Punto getCentro() {
		return new Punto(centro);
	}
	
	public double getRadio() {
		return radio;
	}
	
	public void trasladar(double x, double y) {
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((centro == null) ? 0 : centro.hashCode());
		long temp;
		temp = Double.doubleToLongBits(radio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circunferencia other = (Circunferencia) obj;
		if (centro == null) {
			if (other.centro != null)
				return false;
		} else if (!centro.equals(other.centro))
			return false;
		if (Double.doubleToLongBits(radio) != Double.doubleToLongBits(other.radio))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Circunferencia [centro=" + centro + ", radio=" + radio + "]";
	}
	
	

}
