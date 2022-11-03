package cl.generation.f20221102.interfaces;

public class Persona extends Humano {
	
	private String nombre;

	public Persona() {
		super();
	}

	public Persona(boolean razonamiento, String nombre) {
		super(razonamiento);
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", isRazonamiento()=" + isRazonamiento() + ", getPeso()=" + getPeso()
				+ ", getAltura()=" + getAltura() + "]";
	}
	
	
	

}
