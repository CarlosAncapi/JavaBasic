package cl.generation.f20221102.interfaces;

public class Leon extends Carnivoro {
	
	private String sonido;
	
	

	public Leon() {
		super();
	}
	

	public Leon(String sonido) {
		super();
		this.sonido = sonido;
	}
	


	public Leon(float peso, float altura, String comida, String sonido) {
		super(peso, altura, comida);
		this.sonido = sonido;
	}


	
	public void comida() {
		System.out.println("come carne");
	}

}
