package cl.generation.f20221024;

import java.util.Arrays;
import java.util.Iterator;

public class PracticaArreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escribir un arreglo de tamaño de 10 ,con números positivos y negativos , capturar en máximo y mínimo
		int [] ejercicio = {-5,-4,-3,-2,-1,1,2,3,4,5};
		int maximo = 0;
		int minimo = 0;
		
		for (int i = 0; i <ejercicio.length; i++) {
			
			if (maximo<ejercicio[i]) {
				maximo=ejercicio[i];
				
			}
			if (minimo>ejercicio[i]) {
				minimo=ejercicio[i];
		
			}
		
		}
		
		System.out.println(maximo);
		System.out.println(minimo);
		
		/*2. 
		 * El mismo arreglo crear otros 2 arreglos, uno con solo los pares y otro arreglo solo con los impares
		 * 
		 */
		int [] pares = new int[ejercicio.length] ;
		int [] impares = new int[ejercicio.length];
		int contador = 0;
		
		
		for (int i = 0; i < ejercicio.length; i++) {
			
			if(ejercicio[i]%2==0) {
				pares[i]=ejercicio[i];	
			}
			else {
				impares[i]=ejercicio[i];
				contador++;
			}
		}
		
		int totalpares =(ejercicio.length)-contador;
		int totalimpares =contador;
		
		System.out.println("-----------------------------");
		System.out.println("El total de pares es: "+totalpares);
		System.out.println("el arreglo es: "+Arrays.toString(pares));
		System.out.println("-----------------------------");
		System.out.println("El total de impares es: "+totalimpares);
		System.out.println("el arreglo es: "+Arrays.toString(impares));
		
		//3. Para el mismo arreglo, sacar el promedio de los números.
		// primero creamos las variables para la suma de los valores y el promedio
		
		int acumuladorSuma = 0;
		int promedio =0;
		
		for (int i = 0; i < ejercicio.length; i++) {
			acumuladorSuma=acumuladorSuma+ejercicio[i];
		}
		
		promedio =acumuladorSuma/ejercicio.length;
		System.out.println("-----------------------------");
		System.out.println("el promedio del arreglo original es :"+promedio);
}
	
}


