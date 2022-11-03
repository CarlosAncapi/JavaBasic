package cl.generation.f20221102.interfaces;

public class Carnivoro extends Animal{
	
	private String comida;
	
	
	
	public Carnivoro() {
		super();
	}



	public Carnivoro(float peso, float altura, String comida) {
		super(peso, altura);
		this.comida = comida;
	}

	

	public String getComida() {
		return comida;
	}



	public void setComida(String comida) {
		this.comida = comida;
	}



	@Override
	public void metodoEnAnimal() {
		System.out.println("el leon come carne");
		// TODO Auto-generated method stub
		
	}

}
