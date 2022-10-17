package ejerciciosboletin1;

import java.util.Scanner;

public class Ejercicio8 {

	/*
	 * Escribir una aplicación que pida al usuario un número real y muestre por
	 * pantalla la nota del alumno, teniendo en cuenta
	 */

	public static void main(String[] args) {

		// Creamos la variable num para pedirla al usuario.
		int num;

		// Creamos el escaner para leer datos
		Scanner key = new Scanner(System.in);

		// Pedimos la variable al usuario
		System.out.println("Deme su nota: ");
		num = key.nextInt();

		// Creamos varios if anidados para definir las condiciones de cada nota
		if (num < 0 || num > 10) { // Lo que hacemos en cada una de las condiciones es especificar el rango que hay
									// de número por cada nota, siempre habrá mínimo un número inclusive.
			System.out.println("No está en el rango de 1 al 10");
		} else
		  if (num < 5) { //Si la nota está dentro del rango del 0 a 4,99 es INSUFICIENTE
			System.out.println("INSUFICIENTE");
		} else if (num < 6) { //Si la nota está dentro del rango del 5 a 5,99 es SUFICIENTE
			System.out.println("SUFICIENTE");
		} else if (num < 7) { //Si la nota está dentro del rango del 6 a 6,99 es BIEN
			System.out.println("BIEN");
		} else if (num < 9) { //Si la nota está dentro del rango del 7 a 8,99 es NOTABLE
			System.out.println("NOTABLE");
		} else if (num <= 10) { //Si la nota está dentro del rango del 9 a 9,99 es SOBRESALIENTE
			System.out.println("SOBRESALIENTE");
		}

		// Cerramos el escaner
		key.close();
		
	}

}
