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
		
		System.out.println(long1 +" "+decimal+" "+double1);
		
		//variable objeto
		
		String palabra = "Qwerty";
		//palabra.
		Integer numero2 =2;// variable numerica -2^31 y +2^31
		//numero2.
		
		// un int a long, un long a float y un long a double 
		int prueba1 = 1000;
		Long prueba2 = Long.parseLong(prueba1+"");
		// lo que esta dentro del parentesis se transforma en string al concatenar el +""
		float prueba3 = Float.parseFloat(prueba2+"");
		
		double prueba4 = Double.parseDouble(prueba3+"");
		
		float prueba5 = Float.parseFloat(prueba4+"");
		
		Long prueba6 = Long.parseLong(prueba5+"");
		
		//Integer prueba7 = int.valueOf(prueba6);
		
				
		
		//value of retorna un integer, una varaiable no primitiva
		
		//parseint retorna un valor primitivo
		
		
		
		

	}

}
