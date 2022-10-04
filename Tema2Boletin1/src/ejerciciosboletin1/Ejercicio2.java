package ejerciciosboletin1;

import java.util.Scanner;

public class Ejercicio2 {

	/*
	 * Pedir dos números enteros y decir si son iguales o no.
	 */

	public static void main(String[] args) {

		// Creamos variables, en este caso pedimos dos número enteros.
		int num1, num2;

		// Creamos el escaner para leer los datos
		Scanner key = new Scanner(System.in);

		// Pedimos las variables num1 y num2 de tipo entero al usuario.
		System.out.println("Deme dos números enteros por separado: ");
		num1 = key.nextInt();
		num2 = key.nextInt();

		// Crearemos un if para que si no son iguales los dos números devolverá un
		// String.
		if (num1 != num2) {
			System.out.println("No son números iguales");
		} else {
			System.out.println("Son números iguales");
		}

		// Cerramos el escaner
		key.close();
	}

}
