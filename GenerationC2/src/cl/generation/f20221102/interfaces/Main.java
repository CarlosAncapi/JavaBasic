package cl.generation.f20221102.interfaces;

public class Main {

	public static void main(String[] args) {
		// interfaces y clases abstractas
		
		//no se pueden instanciar clases abstractas
		//Animal animal= new Animal();
		
		Caballo caballo = new Caballo();
		caballo.setAltura(2.5f);
		
		Humano humano = new Humano();
		humano.metodoEnAnimal();
		
		Leon leon=new Leon();
		leon.setAltura(1.5f);
		leon.setPeso(252.5f);
		
		System.out.println(leon);
		leon.comida();
		System.out.println("------------------");
		
		System.out.println("altura: "+leon.getAltura());
		System.out.println("altura: "+leon.getPeso());
		System.out.println("------------------");
		
		
		System.out.println(leon.toString());
		leon.metodoEnAnimal();
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("");
		
		Persona personita =new Persona();
		personita.setNombre("carlos");
		personita.setRazonamiento(true);
		personita.setAltura(1.92f);
		personita.setPeso(102.3f);
		
		
		
		System.out.println(personita);
		System.out.println("");
		System.out.println("--------------------------------------------------------------------");
		System.out.println(personita.toString());
		personita.metodoEnAnimal();
		personita.comer();
		personita.respirar();
	}

}
