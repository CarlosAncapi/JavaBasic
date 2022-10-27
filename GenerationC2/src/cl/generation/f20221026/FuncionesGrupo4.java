package cl.generation.f20221026;

import java.util.Scanner;

public class FuncionesGrupo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String nombre=obtenerNombrecompleto();
		int edad=obtenerEdad();
		float peso=obtenerPeso();
		float estatura=obtenerEstatura();
		float IMC=obtenerIMC(peso, estatura);
		String tipoIMC=nivelIMC(IMC);
		
		System.out.println(IMC);	
		System.out.println("su imc dice que: "+ tipoIMC);
		
		scanner.close();
	}
	/*metodo que devuelve el nombre completo 
	 * 
	 */
	public static String obtenerNombrecompleto() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingresa tu nombre");
		String nombre= scanner.next();
		System.out.println("ingresa tu apellido paterno");
		String apePaterno= scanner.next();
		System.out.println("ingresa tu apellido materno");
		String apeMaterno= scanner.next();
		String nombreCompleto = nombre+" "+apePaterno+" "+apeMaterno;
		return nombreCompleto;
		
	}
	//metodo edad
	
	public static int obtenerEdad() {
		Scanner scanner = new Scanner(System.in);
		int edad =0;
		do {
			System.out.println("ingresa tu edad: ");
			edad= scanner.nextInt();
		}while(edad<18 || edad>120);
		
		System.out.println("tu edad es: "+edad);
		System.out.println("--------------------------------");
		return edad;
	}
	//metodo kilos
	public static float obtenerPeso(){
		Scanner scanner = new Scanner(System.in);
		float kilos =0f;
		do {
			System.out.println("ingresa tu peso en kilos: ");
			kilos= scanner.nextFloat();
		}while(kilos<40 || kilos>150);
		
		System.out.println("tu peso en kilos es: "+kilos);
		System.out.println("--------------------------------");
		return kilos;
	}
	//obtener estatura
	public static float obtenerEstatura() {
	Scanner scanner = new Scanner(System.in);
	
	float estatura =0f;
	
	do {
		System.out.println("ingresa tu estatura en metros: ");
		estatura= scanner.nextFloat();
	}while(estatura<0.5f || estatura>2.5f);
	
	System.out.println("tu estatura es: "+estatura);
	System.out.println("--------------------------------");
	
	scanner.close();
	return estatura;
	}
	//metoddo imc
	public static float obtenerIMC(float peso, float estatura) {
		float IMC =peso/(estatura*estatura);
		return IMC;
		
	}
	//metodo tipo imc
	public static String nivelIMC(float imc) {
		String tipoIMC="";
		
		if (imc < 18.5f) {
			tipoIMC="el paciente esta bajo de peso";
		} else if (imc >= 18.5f && imc < 25) {
			tipoIMC="el paciente esta en rango normal de peso";
		} else if (imc >= 25 && imc < 30) {
			tipoIMC="el paciente e se encuentra sobre peso";
		} else {
			tipoIMC="el paciente se encuentra obeso";
		}
		return tipoIMC;
	}
}
