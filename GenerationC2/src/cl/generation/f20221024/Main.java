package cl.generation.f20221024;
//en este espacio se importan librerias

public class Main {

	public static void main(String[] args) {
		//las variables 
		//var nombre_variable
		
		//variables primitivas, caracter estatico
		int numero = 2;// variable numerica -2^31 y +2^31
		
		//variable primitiva 
		
		long long1 = 21211348l;
		float decimal =2.5f;//
		float decimal2 = (float) 2.5; //castear 
		double double1 = 9.8d;
			
		char caracter = 'a'; // los char siempre usan un solo carac6ter con comillas simples
		
		boolean respuesta = true;// tambien puede ser false 
		
		//short y byte 
		
		System.out.println(long1 +" / "+decimal+" / "+double1);
		System.out.println("---------------------------");
		//variable objeto
		
		String palabra = "Qwerty";
		//palabra.
		Integer numero2 =2;// variable numerica -2^31 y +2^31
		//numero2.
		
		// un int a long, un long a float y un long a double 
		
		int prueba1 = 1000;
		System.out.println("variable prueba 1 es int: "+prueba1);
		System.out.println("---------------------------");
		
		Long prueba2 = Long.parseLong(prueba1+"");
		System.out.println("variable prueba 2 es long: "+prueba2);
		System.out.println("---------------------------");
		
		
		float prueba3 = Float.parseFloat(prueba2+"");
		System.out.println("variable prueba 3 es flot: "+prueba3);
		System.out.println("---------------------------");
		
		
		double prueba4 = Double.parseDouble(prueba3+"");
		System.out.println("variable prueba 4 es double: "+prueba4);
		System.out.println("---------------------------");
		
		//ahora al reves
		
		
		float prueba5 = Float.parseFloat(prueba4+"");
		System.out.println("variable prueba 5 es float: "+prueba5);
		System.out.println("---------------------------");
		
		long prueba6 = (long) prueba5;
		System.out.println("variable prueba 6 es long: "+prueba6);
		System.out.println("---------------------------");
		
		
		int prueba7 = Math.round(prueba6);
		System.out.println("variable prueba 7 es int: "+prueba7);
		System.out.println("---------------------------");
		
				
		
		//value of retorna un integer, una varaiable no primitiva
		
		//parseint retorna un valor primitivo
		
		
		
		

	}

}
