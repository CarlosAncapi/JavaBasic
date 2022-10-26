package cl.generation.f20221026;

import java.util.Scanner;

public class CapturarDatos {

	public static void main(String[] args) {

		Float imcito = calculoIMC();
		System.out.println("su imc es de: " + imcito);

		nivelIMC(imcito);
	}

	public static Float calculoIMC() {

		// Capturar datos ingresados por el usuario
		Scanner escaneo = new Scanner(System.in);

		// calculo del imc;
		// imc=kilos/(estatura*esatura);

		System.out.println("ingrese su peso en kilos");
		Float pesokilos = escaneo.nextFloat();

		System.out.println("ingrese su estatura en metros");
		Float estatura = escaneo.nextFloat();

		Float imc = pesokilos / (estatura * estatura);

		escaneo.close();
		return imc;
	}

	public static void nivelIMC(float imc) {
		/*
		 * Por debajo de 18.5 Bajo peso 18.5 - 24.9 Normal 25.0 - 29.9 Sobrepeso 30.0 o
		 * más Obeso
		 */
		if (imc < 18.5f) {
			System.out.println("el paciente esta bajo de peso");
		} else if (imc >= 18.5f && imc < 25) {
			System.out.println("el paciente esta en rango normal de peso");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("el paciente e se encuentra sobre peso");
		} else {
			System.out.println("el paciente se encuentra obeso");
		}

	}

}