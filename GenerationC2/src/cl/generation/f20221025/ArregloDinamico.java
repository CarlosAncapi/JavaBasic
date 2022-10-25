package cl.generation.f20221025;

import java.util.ArrayList;

public class ArregloDinamico {

	public static void main(String[] args) {
		// Arraylist
		// 1. definicion
		// ArrayList<TIPODATO> nombre_array= new ArrayList<TIPODEDATO>();
		ArrayList<String> relatores = new ArrayList<String>();
		// 2. agregar valores al arreglo
		relatores.add("Alejandro");
		relatores.add("Andrea");
		relatores.add("Laura");
		relatores.add("Pamela");
		relatores.add("Hector");
		relatores.add("Maggi");
		relatores.add("Israel");
		System.out.println(relatores);
		System.out.println("-----------------------");

		ArrayList<String> miembrosg4 = new ArrayList<String>();
		miembrosg4.add("Maria teresa");
		miembrosg4.add("Ignacia");
		miembrosg4.add("Michel");
		miembrosg4.add("Ivan");
		miembrosg4.add("Carlos");

		System.out.println(miembrosg4);
		System.out.println("-----------------------");

		// como obtener el tamaño del arraylist
		System.out.println(miembrosg4.size());
		System.out.println("-----------------------");

		// length --> arreglos estaticos
		// size -----> arreglos dinamicos

		// 4 obtener un elemento dentro de un Arraylist con ".get" empieza del indice 0
		System.out.println(miembrosg4.get(4));
		System.out.println(miembrosg4.get(0));
		System.out.println("-----------------------");
		// System.out.println(miembrosg4.get(6)); --> el indice 6 (7 elementos) no
		// existe, ya que en el Arraylist solo tine 5 elementos

		// 5 eliminar un elemento dentro del arraylist con ".remove"
		miembrosg4.remove(4);
		System.out.println(miembrosg4);
		miembrosg4.add("Carlos");
		System.out.println(miembrosg4);
		miembrosg4.remove(0);
		System.out.println(miembrosg4);
		miembrosg4.add("Maria Teresa");
		System.out.println(miembrosg4);
		System.out.println("-----------------------");

		// 6 recorrer el Arraylist
		for (int i = 0; i < miembrosg4.size(); i++) {
			System.out.println("posicion del arreglo: " + i + " nombre del miembro del grupo4: " + miembrosg4.get(i));
		}
		System.out.println("-----------------------");

		// for iterador o for de objeto

		for (String relator : relatores) {
			System.out.println(relator);
		}
		
	}

}
