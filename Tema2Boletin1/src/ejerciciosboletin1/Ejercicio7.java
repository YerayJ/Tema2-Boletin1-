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
		if (num < 0 && num > 99.999) {
			System.out.println("El número tiene que estar entre el rango de 1 y 99.999");
			// En este caso imprimimos el error avisando que el número tiene que estar
			// dentro del rango
		} else {
			if (num <= 9) {
				System.out.println("El número es de una cifra");
			} else if (num <= 99) {
				System.out.println("El número es de dos cifras");
			} else if (num <= 999) {
				System.out.println("El número es de tres cifras");
			} else if (num <= 9999) {
				System.out.println("El número es de cuatro cifras");
			} else if (num <= 99999) {
				System.out.println("El número es de cinco cifras");
			}

		}

		// Cerramos el escaner
		key.close();

	}

}
