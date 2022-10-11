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
		if (num1 > num2 && num1 > num3) { // En esta condición comprobaremos si num1 es el número más grande, una vez
											// hecho comprobamos quien de num2 o num3 es más grande e imprimimos según
											// el orden.
			System.out.println(num2 > num3 ? "Los número ordenados serán " + num1 + " " + num2 + " " + num3
					: "Los número ordenados serán " + num1 + " " + num3 + " " + num2);
		} else if (num3 > num2 && num3 > num1) { // En esta condición comprobaremos si num3 es el número más grande, una
													// vez
			// hecho comprobamos quien de num1 o num2 es más grande e imprimimos según
			// el orden.
			System.out.println(num2 > num1 ? "Los número ordenados serán " + num3 + " " + num2 + " " + num1
					: "Los número ordenados serán " + num3 + " " + num1 + " " + num2);
		} else { // En esta condición comprobaremos si num1 o num2 es más grande e imprimimos
					// según
			// el orden, ya que sabemos que num3 es el tercero.
			System.out.println(num2 < num1 ? "Los número ordenados serán " + num2 + " " + num3 + " " + num1
					: "Los número ordenados serán " + num2 + " " + num1 + " " + num3);

		}

		// Cerramos el escaner
		key.close();
	}
}
