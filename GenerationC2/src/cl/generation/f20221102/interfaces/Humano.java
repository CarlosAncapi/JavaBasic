package cl.generation.f20221102.interfaces;

public class Humano extends Omnivoro implements Generico {
	
	private boolean razonamiento;

	public Humano() {
		super();
	}

	public Humano(boolean razonamiento) {
		super();
		this.razonamiento = razonamiento;
	}

	public boolean isRazonamiento() {
		return razonamiento;
	}

	public void setRazonamiento(boolean razonamiento) {
		this.razonamiento = razonamiento;
	}

	@Override
	public void respirar() {
		System.out.println("respira a traves de la nariz");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comer() {
		System.out.println("come en la mesa");
		// TODO Auto-generated method stub
		
	}
	
	
}
