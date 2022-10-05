package ejerciciosboletin1;

import java.util.Scanner;

public class Ejercicio3 {

	/*
	 * Implementar un programa que pida por teclado un número decimal e indique si
	 * es un número casi-cero, que son aquellos, positivos o negativos, que se
	 * acercan a 0 por menos de 1 unidad, aunque curiosamente el 0 no se considera
	 * un número casi-cero. Es decir, un número casi-cero es el que se encuentra en
	 * el intervalo (-1, 1), donde se excluye el -1, el 0 y el 1.
	 */

	public static void main(String[] args) {
		
		// Creamos las variables. La crearemos de tipo double, ya que el ejercicio pide
		// decimales.
		double num;

		// Creamos el escaner para leer datos.
		Scanner key = new Scanner(System.in);

		// Pedimos la variable por el escaner
		System.out.println("Deme un número con decimales (sepárelo con una coma): ");
		num = key.nextDouble();

		// Hacemos la condición con un if, en el que el número si es 0 o está fuera del
		// intervalo de -1 y 1 no es un número casi 0
		if (num == 0 || num <= -1 || num >= 1) {
			System.out.print("El numero no es casi cero");
		} else {
			System.out.print("El numero es casi cero"); // Aquí al estar dentro del intervalo y no ser ni 0,-1 y 1, la
														// condición del ejercicio es correcta
		}

		// Cerramos el escaner
		key.close();

	}

}
