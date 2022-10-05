package ejerciciosboletin1;

import java.util.Scanner;

public class Ejercicio5 {

	/*
	 * Pedir tres números y mostrarlos ordenados de mayor a menor.
	 */

	public static void main(String[] args) {

		// Creamos las variables. Esta vez solo crearemos tres variables de tipo entero.
		int num1, num2, num3;

		// Creamos el escaner para leer datos
		Scanner key = new Scanner(System.in);

		// Pedimos las variables por pantalla
		System.out.println("Deme tres números enteros y los ordenaré de mayor a menor: ");
		num1 = key.nextInt();
		num2 = key.nextInt();
		num3 = key.nextInt();

		// Creamos la condición.
		if (num1 < num2) {

			// Cerramos el escaner
			key.close();

		}

	}
}
