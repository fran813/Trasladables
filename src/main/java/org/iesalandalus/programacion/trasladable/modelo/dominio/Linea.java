package org.iesalandalus.programacion.trasladable.modelo.dominio;

public class Linea {
	
	private Punto p1;
	private Punto p2;
	
	public Linea(Punto p1, Punto p2) {
		setP1(p1);
		setP2(p2);
	}
	
	public Linea (Linea linea) {
		
		if ( linea == null) {
			throw new NullPointerException("No puedo copiar una línea nula.");
		}
		setP1(linea.getP1());
		setP2(linea.getP2());
	}
	
	private void setP1(Punto p1) {
		
		if (p1 == null) {
			throw new NullPointerException("No se puede copiar un p1 nulo.");
		}
		this.p1 = new Punto(p1);
	}
	
	private void setP2(Punto p2) {
		
		if (p2 == null) {
			throw new NullPointerException("No se puede copiar un p2 nulo.");
		}
		this.p2 = new Punto(p2);
		
	}
	
	public Punto getP1() {
		return new Punto(p1);
	}
	
	public Punto getP2() {
		return new Punto(p2);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((p1 == null) ? 0 : p1.hashCode());
		result = prime * result + ((p2 == null) ? 0 : p2.hashCode());
		return result;
	}
	
	public void trasladar(double x, double y) {
		
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Linea other = (Linea) obj;
		if (p1 == null) {
			if (other.p1 != null)
				return false;
		} else if (!p1.equals(other.p1))
			return false;
		if (p2 == null) {
			if (other.p2 != null)
				return false;
		} else if (!p2.equals(other.p2))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Linea [p1=" + p1 + ", p2=" + p2 + "]";
	}

	
	
}
