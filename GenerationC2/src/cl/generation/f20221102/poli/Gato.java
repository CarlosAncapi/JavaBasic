package cl.generation.f20221102.poli;

public class Gato extends Mascota {
	
	private String sonido;

	public Gato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gato(String raza, String nombre, String sexo) {
		super(raza, nombre, sexo);
		// TODO Auto-generated constructor stub
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

	@Override
	public String toString() {
		return "Gato [sonido=" + sonido + ", getRaza()=" + getRaza() + ", getNombre()=" + getNombre() + ", getSexo()="
				+ getSexo() + "]";
	}
	
	@Override
	public void emitirSonido() {
		System.out.println("el sonido (maullido) es miau miau ");
	}
	
	
	

}
