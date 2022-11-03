package cl.generation.f20221102;

import cl.generation.f20221102.poli.Mascota;
import cl.generation.f20221102.poli.Gato;
import cl.generation.f20221102.poli.Perro;

public class PoliMain {

	public static void main(String[] args) {
		// Polimorfismo
		
		Mascota mascota = new Mascota();
		mascota.emitirSonido();
		System.out.println("--------------------------------------");
		
		Gato gatito = new Gato();
		gatito.emitirSonido();
		System.out.println("--------------------------------------");
		
		Perro perrito= new Perro();
		perrito.emitirSonido();
		
		
		System.out.println("--------------------------------------");
		System.out.println("");
		System.out.println("             Polimorfismo");
		System.out.println("--------------------------------------");
		
		
		/*Una super clase se comporta como una clase hija, pero no es una clase hija
		 * debe existir herencia, jerarquia de clase
		 */
		Mascota regalon = new Perro();
		regalon.emitirSonido();
		regalon.setNombre("firulais");
		System.out.println(regalon.toString());
		System.out.println("--------------------------------------");
		
		Mascota michi = new Gato();
		michi.emitirSonido();
		System.out.println(michi.toString());
		System.out.println("--------------------------------------");
		
		/*polimorfismo parametrico
		 * el metodo se escribe igual pero recibe distintos parametros
		 * 
		 */
		michi.horasSiesta();
		System.out.println("");
		
		michi.horasSiesta(12.5f);
		System.out.println("");
		
		michi.horasSiesta(10);
		System.out.println("");
		
		Perro dogsito=(Perro) regalon;
		System.out.println(dogsito);
		
		
	}

}
