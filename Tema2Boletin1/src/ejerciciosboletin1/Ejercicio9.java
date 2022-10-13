package ejerciciosboletin1;

import java.util.Scanner;

public class Ejercicio9 {

	/*
	 * Escribir un programa que simule el juego de PIEDRA, PAPEL, TIJERA, pidiendo a
	 * cada jugador que escriba PIEDRA, PAPEL o TIJERA. El juego debe mostrar por
	 * pantalla quién ha ganado el juego tras jugar una partida. Hay que contemplar
	 * el caso de que empaten.
	 */

	public static void main(String[] args) {

		// Creamos variables, las guardamos como números para poder comparar con la
		// variable del usuario.
		final int PIEDRA = 1;
		final int PAPEL = 2;
		final int TIJERAS = 3;
		int jugador1, jugador2;

		// Creamos el escaner para leer datos
		Scanner key = new Scanner(System.in);

		// Pedimos las variables al usuario. Le indicamos que nos pase como número las
		// variables para poder comparar.
		System.out.println("Jugador1 ¿PIEDRA[1] PAPEL[2] O TIJERAS[3]?: ");
		jugador1 = key.nextInt();
		System.out.println("Jugador2 ¿PIEDRA[1] PAPEL[2] O TIJERAS[3]?: ");
		jugador2 = key.nextInt();

		// Hacemos los ifs anidados comparando las constantes con las variables pasadas
		// por el usuario.
		if (jugador1 < 1 && jugador1 > 3) { // Si el número pasado no es correcto por parte de los dos jugadores
											// directamente nos dará un error.
			System.out.println("Los números no son correctos");
		} else if (jugador2 < 1 && jugador2 > 3) {
			System.out.println("Los números no son correctos");
		}

		else if (jugador1 == jugador2) { // Crearemos otro if nuevo en el que se compruebe primero si los jugadores son
									// iguales, en ese caso empatan.
			System.out.println("EMPATE");
		} else if (jugador1 == TIJERAS && jugador2 == PAPEL || jugador1 == PIEDRA && jugador2 == TIJERAS
				|| jugador1 == PAPEL && jugador2 == PIEDRA) { // En este else if se expone todos los casos en el que
																// jugador1 gana si es así se imprime sino para al
																// siguiente else.
			System.out.println("JUGADOR 1 GANA");
		} else { // Y por último lo que quedaría es que jugador 2 ganaría.
			System.out.println("JUGADOR 2 GANA");
		}

		// Cerramos el escaner
		key.close();

	}

}
