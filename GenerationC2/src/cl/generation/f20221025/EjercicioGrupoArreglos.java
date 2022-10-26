package cl.generation.f20221025;

import java.util.HashMap;
import java.util.Iterator;

public class EjercicioGrupoArreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = new int[6];
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		numeros[5] = 6;
		int i = 0;

		// el ciclo while ciclara hasta que se rompa
		// la condicion que esta en el parentesis
		// por eso se detendra cuando numeros[i]=5
		while (numeros[i] != 5) {
			i++;
		}
		System.out.println(i);

		// presentacion sobre diferencias entre:

		// hashmap :
		// como recorrer un arreglo con while
		// y con iterator
		
		//1-como se crea un Hashmap
		HashMap<String, String> seriesFavoritas = new HashMap<String, String>();
		
		//2-como añadir elementos al hashMap
		seriesFavoritas.put("Carlos", "Sons of Anarchy");
		seriesFavoritas.put("Ivan", "Better Call Saul");
		seriesFavoritas.put("Ignacia", "Young Royals");
		seriesFavoritas.put("Michel", "Mandalorian");
		seriesFavoritas.put("Maria Teresa", "One Piece");
		
		//3-imprimiendo el Hash map
		System.out.println("este es el mapa: "+seriesFavoritas);
		System.out.println("----------------------------------------------");
		
		//4- iterando el Hash map
		System.out.println("asi se itera un hashMap");
		
		Iterator it = seriesFavoritas.keySet().iterator();
		
		while(it.hasNext()){
		    String clave = (String)it.next();
		    String valor = seriesFavoritas.get(clave);
		    System.out.println("Clave: " + clave + ", valor: " + valor);
		}
		System.out.println("----------------------------------------------");
		
		//5- conocer el tamaño del mapa
		System.out.println("como saber el tamaño del Hash Map");
		System.out.println(seriesFavoritas.size());
		
		// hashset :
		// como recorrer un arreglo con while
		// y con iterator

		// arraylist :
		// como recorrer un arreglo con while
		// y con iterator

	}

}
