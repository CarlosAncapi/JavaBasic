package cl.generation.f20221102.interfaces;

public abstract class Animal {
	private float peso;
	private float altura;
	
	public Animal() {
		super();
	}

	public Animal(float peso, float altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Animal [peso=" + peso + ", altura=" + altura + "]";
	}
	
	/*
	public  void metodoEnAnimal() {
		System.out.println("estoy en el metodo animal");
	}
	*/
	public abstract void metodoEnAnimal();
		
	
	
}
