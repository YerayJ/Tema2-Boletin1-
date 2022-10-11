package ejerciciosboletin1;

import java.util.Scanner;

public class Ejercicio7 {

	/*
	 * Escribir una aplicación que indique cuántas cifras tiene un número
	 * introducido por teclado, que está comprendido entre 0 y 99.999.
	 */

	public static void main(String[] args) {

		// Creamos las variables. Las haremos de tipo double para hacer las operaciones.
		double num, cifras;

		// Creamos un escaner para leer datos
		Scanner key = new Scanner(System.in);

		// Pedimos la variable al usuario
		System.out.println("Deme un número para contar las cifras que tiene: ");
		num = key.nextDouble();

		// Hacemos un if donde como condición será que el número este dentro del rango
		// entre 0 y 99.999.
		if (num > 0 && num < 99.999) {
			cifras = (Math.log10(num) + 1); // En esta operación usamos el Math.log10 que saca el logaritmo en base 10 y
											// al resultado siempre le sumaremos 1.
			System.out.println("El número de cifras es: " + (int) cifras); // Por último le hacemos una conversión
			// a tipo int para imprimirlo.

		} else {
			System.out.println("El número tiene que estar entre el rango de 1 y 99.999");
			// En este caso imprimimos el error avisando que el número tiene que estar
			// dentro del rango
		}

		// Cerramos el escaner
		key.close();

	}

}
