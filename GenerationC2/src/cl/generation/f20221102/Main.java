package cl.generation.f20221102;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// herencia en java
		//instanciando objetos
		
		Entrenador entrenador = new Entrenador();
		entrenador.setNombre("Jhon");
		entrenador.setApellido("Doe");
		entrenador.setEdad(55);
		entrenador.setAnios_experiencia(10);
		entrenador.setEquipo("Valdivia");
		
		System.out.println(entrenador.toString());
		
		Kinesiologo kine = new Kinesiologo();
		kine.setNombre("pedro");
		kine.setApellido("nuñez");
		kine.setEdad(30);
		kine.setTitulo("kinesiologia");
		kine.setEspecialidad("En musculos");
		
		System.out.println(kine.toString());
		
		ArrayList<Basquebolista> listaJugadores = new ArrayList<Basquebolista>();
		
		Basquebolista basque1 = new Basquebolista();   
		basque1.setNombre("Michael");
		basque1.setApellido("Pipen");
		basque1.setAltura(2.15f);
		
		listaJugadores.add(basque1); // agregando un objeto de tipo Basquebolista al arraylist listaJugador
		
		Basquebolista basque2 = new Basquebolista();
		basque2.setNombre("Steve");
		basque2.setApellido("Curry");
		basque2.setAltura(2.25f);
		
		listaJugadores.add(basque2);// agregando otro objeto Basquebolista al Arraylist listaJugador 
		
		//System.out.println(listaJugadores);
		System.out.println("------------------------------------------");
		
		for (Basquebolista jugador: listaJugadores) {
			System.out.println(jugador.toString());
		}
		
		//
		Entrenador ayudanteEntrenador = new Entrenador("carlos","Ancapi",28,10,"colo");
		
		System.out.println(ayudanteEntrenador);
		
		//EquipoBasquetbol.metodoImprimir();
		EquipoBasquetbol equi = new EquipoBasquetbol();
		Ayudante ayu = new Ayudante();
		
		equi.metodoImprimir();
		entrenador.metodoImprimir();
		kine.metodoImprimir();
		basque1.metodoImprimir();
		ayu.metodoImprimir();
		
	}

	
}
