package ejerciciosboletin1;

import java.util.Scanner;

public class Ejercicio10 {

	/*
	 * Escribir un programa que pida al usuario tres números enteros, y que muestre
	 * por pantalla si la suma de dos de esos números da como resultado el otro
	 * número.
	 */

	public static void main(String[] args) {

		// Creamos variables de tipo int, 3 tipos de num y las variables para guardar
		// las sumas
		int num1, num2, num3;

		// Creamos un escaner para leer datos
		Scanner key = new Scanner(System.in);

		// Pedimos las variables por pantalla, en este caso 3 números que nos tiene que
		// devolver como variables enteras.
		System.out.println("Deme tres números: ");
		num1 = key.nextInt();
		num2 = key.nextInt();
		num3 = key.nextInt();

		// Creamos las condiciones
		if ((num1 + num2) == num3) { // Si la suma de num1 y num2 da como resultado num3 lo imprimos
			System.out.println("La suma de num1 y num2 es igual a num3");
		} else if ((num1 + num3) == num2) { // Si la suma de num1 y num3 da como resultado num2 lo imprimos
			System.out.println("La suma de num1 y num3 es igual a num2");
		} else if ((num2 + num3) == num3) { // Si la suma de num3 y num2 da como resultado num1 lo imprimos
			System.out.println("La suma de num2 y num3 es igual a num1");
		} else { // Si ninguna de las tres se cumple, doy como entendido que ninguna suma da como
					// resultado ninguno de los números pasados.
			System.out.println("La suma de dos números no da el resultado de un tercero");
		}

		// Cerramos el escaner
		key.close();
	}

}
