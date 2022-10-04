package ejerciciosboletin1;

import java.util.Scanner;

public class Ejercicio1 {

	/*
	 * Diseñar una aplicación que solicite al usuario un número e indique si es par
	 * o impar.
	 */

	public static void main(String[] args) {
		
		// Creamos variables
		int num;
		
		// Creamos el escaner para leer datos.
		Scanner key = new Scanner(System.in);
		
		// Pedimos la variable num al usuario mediante escaner.
		System.out.print("Deme un número entero: ");
		num = key.nextInt();
		
		// Crearemos un if donde añadiré una condición para saber si el número es par.
		if (num % 2 == 0) {
			System.out.print("El número es par");
		} else {
			System.out.print("El número es impar");
		}

		//Cerramos el escaner
		key.close();
		
	}

}
