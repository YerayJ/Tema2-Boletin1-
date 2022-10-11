package ejerciciosboletin1;

import java.util.Scanner;

/*
 * Pedir los coeficientes de una ecuación de segundo grado y mostrar sus soluciones reales. Si no existen, habrá que indicarlo. Hay que tener en cuenta que las soluciones de una ecuación de segundo grado
 */

public class Ejercicio6 {

	public static void main(String[] args) {

		// Creamos variables
		double a, b, c, x1, x2;
		double raiz;// Las variables que se pedirá por pantalla serán a, b y c. La x serán variables
					// auxiliares. Y en la raiz guardamos la operación.

		// Creamos el escaner para leer datos
		Scanner key = new Scanner(System.in);

		// Pedimos las variables por pantalla de valor entero.
		System.out.println("Deme de manera ordenada las variables a, b y c: ");
		a = key.nextInt();
		b = key.nextInt();
		c = key.nextInt();

		// Realizamos la ecuación de segundo grado.
		raiz = (b * b - 4 * a * c); // Guardamos en la variable la operación de la raiz.
		// Ahora realizamos las dos operaciones y hacemos la raiz con la función sqrt.
		// *He tenido que poner las operaciones fuera del else, ya que al ponerlas
		// dentro me daba error al imprimir el resultado*
		x2 = (-b - Math.sqrt(raiz)) / 2 * a;
		x1 = (+b - Math.sqrt(raiz)) / 2 * a;

		if (raiz <= 0) { // Si la raíz es menor-igual que el número 0, imprimimos error.
			System.out.println("ERROR");
		} else { // Por último imprimimos el resultado de las operaciones.
			System.out.println("El resultado de x2 es: " + x2 + " y el de x1: " + x1);
		}
		// Cerramos el escaner
		key.close();

	}

}
