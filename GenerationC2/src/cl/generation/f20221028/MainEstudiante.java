package cl.generation.f20221028;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEstudiante {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub Estudiante alumno1 = new
		 * Estudiante("Carlos", "ancapi", "1234556-5"); // imprimiendo con metodo
		 * toString System.out.println(alumno1.toString()); // añadiendo los elementos
		 * faltantes al objeto creado anteriormente alumno1.setEdad(28);
		 * alumno1.setCurso("1ero A"); alumno1.setCorreo("carlitos@generation.cl"); //
		 * imprimiendo el objeto con todo los parametros agregados
		 * System.out.println(alumno1.toString()); //ingresoEstudiantes();
		 */	
		//aqui importa 
		Scanner sc = new Scanner(System.in);
		ArrayList<Estudiante> Arreglo_estudiantes = new ArrayList<Estudiante>();
		int continuar=1;
		do {
			//aqui instancio la creacion de un nuevo objeto de tipo estudiante
			Estudiante estudiante=new Estudiante();
			
			//aqui creo unas variables que reciben informacion por teclado
			System.out.println("ingrese el nombre del estudiante ");
			String nombre =sc.nextLine();
			System.out.println("ingrese el Apellido del estudiante ");
			String apellido =sc.nextLine();
			System.out.println("ingrese la edad del estudiante ");
			Integer edad = sc.nextInt();
			sc.nextLine();//corrige el error de capturar un numero y depues capturar una cadena de texto
			System.out.println("ingrese el rut del estudiante ");
			String rut =sc.nextLine();
			System.out.println("ingrese el curso del estudiante ");
			String curso =sc.nextLine();
			System.out.println("ingrese el correo del estudiante ");
			String correo =sc.nextLine();
			
			
			
			
			//aqui relleno los elementos del objeto recien creado igualandolos con las variables ingresadas por teclado
			//estudiante es un objeto de la clase "Estudiante"
			estudiante.setNombre(nombre);
			estudiante.setApellido(apellido);
			estudiante.setEdad(edad);
			estudiante.setRut(rut);
			estudiante.setCurso(curso);
			estudiante.setCorreo(correo);
			
			//al arreglo estudiantes le digo que le añadire el objeto que cree en  la linea 23 (ahora que iguale las variables mi objeto esta llenito :3)
			Arreglo_estudiantes.add(estudiante);
			
			//aqui pregunto si quiero seguir con el bucle 
			System.out.println("quiere agregar otro estudiante");
			System.out.println("ingresa el numero (1) si quieres agregar un nuevo alumno");
			System.out.println("ingresa el numero (2) si no quieres continuar");
			continuar=sc.nextInt();
			sc.nextLine();
			
			
			
		}while(continuar==1);
		
		System.out.println("------------");
		for(Estudiante estudiante:Arreglo_estudiantes) {
			System.out.println("nombre: "+estudiante.getNombre());
			System.out.println("apellido: "+estudiante.getApellido());
			System.out.println("edad: "+estudiante.getEdad());
			System.out.println("rut: "+estudiante.getRut());
			System.out.println("curso: "+estudiante.getCurso());
			System.out.println("correo: "+estudiante.getCorreo());
			System.out.println("");
			System.out.println("------------------------------------");
		}
		
		//obtener un estudiante en especifico
		System.out.println(Arreglo_estudiantes.get(0));
		System.out.println("");
		System.out.println("------------------------------------");
		
		//obtener el dato un objeto tipo estudiante dentro de un Arraylist tipo estudiantes 
		System.out.println(Arreglo_estudiantes.get(0).getNombre());
		System.out.println("");
		System.out.println("------------------------------------");
	}
	
}
