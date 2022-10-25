package cl.generation.f20221024;

import java.util.Arrays;
import java.util.Iterator;

public class Arreglos {

	public static void main(String[] args) {
		
		//Arreglos(array) en Java (estaticos no cambia de tamaño)
		int[] arreglo = new int [3];
		
		//arreglo datos
		arreglo[0]=4;
		arreglo[1]=5;
		arreglo[2]=6;
		//arreglo[3]=8;
		
		System.out.println(arreglo);
		System.out.println(arreglo.toString());
		System.out.println(Arrays.toString(arreglo));
		//System.out.println(arreglo[0].toString()); malo	
	
		//{}
		int[] sinNumeros = {};
		System.out.println(sinNumeros.length);
		//sinNumeros[0]=78; //para un arreglo vacio NO SE PUEDE
		String[] vocales = {"a","e","i","o","u"};
		System.out.println("el tamaño del arreglo voales es: "+vocales.length);
		vocales[1]="o";
		vocales[3]="e";
		System.out.println(Arrays.toString(vocales));
		
		//crear un array de numeros flotantes de tamaño 6
		
		float[] ArregloFlotante= new float [6];
		
		System.out.println(Arrays.toString(ArregloFlotante));
		//arreglar 6 elementos
		ArregloFlotante[0]=1.1f;
		ArregloFlotante[1]=2.2f;
		ArregloFlotante[2]=3.3f;
		ArregloFlotante[3]=4.4f;
		ArregloFlotante[4]=5.5f;
		ArregloFlotante[5]=6.6f;
			
		System.out.println(Arrays.toString(ArregloFlotante));
		
		/*
		 * crear un arreglo de enteros tamaño 100
		 * y agregar los valores dinamicamente
		 * desde el 1 al 100
		 * 
		 * 
		 */
		//solucion 1
		int[] arreInt = new int [100];
		for (int i = 0; i < arreInt.length; i++) {
			arreInt[i]=i;
			System.out.println("Elemento :"+(i+1));
		}
		//solucion 2
		int[] arreInt2 = new int[100];
		for (int i = 0; i < arreInt2.length; i++) {
			arreInt2[i]=i+1;
		}
		System.out.println(Arrays.toString(arreInt2));
		
		System.out.println("------------------------------------");
		
		
		//del 100 al 1
		int[] arreint3 = new int[100];
		for (int i = arreint3.length ; i >0 ; i--) {
			arreint3[i-1]=i;
			System.out.println("Elemento :"+i+ " posicion: "+(i-1));
		}
		
		/*	
		
		//System.out.println(Arrays.toString(arreint3));
		
		int [] ejercicio3 = new int [100];
		for (int i= 0; i<ejercicio3.length; i++) {
			ejercicio3[i]= 100-i;
		}
		System.out.println(Arrays.toString(ejercicio3));
		*/
		
		// ejercicio profe
		int[] arreglo100a1 = new int[100];
		//{100,99,98,97...0}
		for(int i =arreglo100a1.length; i>0  ;i-- ) {
			arreglo100a1[arreglo100a1.length - i]= i;
		}

		System.out.println(Arrays.toString(arreglo100a1));
		
		
	}
}
