package ejerciciosboletin1;

import java.util.Scanner;

public class Ejercicio4 {

	/*
	 * Pedir dos números y mostrarlos ordenados de menor a mayor.
	 */

	public static void main(String[] args) {

		// Creamos las variables. Esta vez solo crearemos dos variables de tipo entero.
		int num1, num2;

		// Creamos el escaner para leer datos
		Scanner key = new Scanner(System.in);

		// Pedimos las variables por pantalla
		System.out.println("Deme dos números enteros y los ordenaré de menor a mayor: ");
		num1 = key.nextInt();
		num2 = key.nextInt();

		// Creamos la condición y en este caso será que num1 sea menor que num2.
		if (num1 < num2) {
			System.out.println("Los números ordenados de menor a mayor son: " + num1 + "," + num2);
		} else {
			// Ahora en el caso contrario sería num2 siempre menor por lo que lo imprimimos
			// primero.
			System.out.println("Los números ordenados de menor a mayor son: " + num2 + "," + num1);
		}

		// Cerramos el escaner
		key.close();

	}

}
