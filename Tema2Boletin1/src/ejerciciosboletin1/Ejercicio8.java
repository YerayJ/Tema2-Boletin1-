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
		if (num >= 0 && num < 5) { // Lo que hacemos en cada una de las condiciones es especificar el rango que hay
									// de número por cada nota, siempre habrá mínimo un número inclusive.
			System.out.println("INSUFICIENTE");
		} else if (num >= 5 && num < 6) {
			System.out.println("SUFICIENTE");
		} else if (num >= 6 && num < 7) {
			System.out.println("BIEN");
		} else if (num >= 7 && num < 9) {
			System.out.println("NOTABLE");
		} else if (num >= 9 && num <= 10) {
			System.out.println("SOBRESALIENTE");
		}

		// Cerramos el escaner
		key.close();
		
	}

}
