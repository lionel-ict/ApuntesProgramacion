package ud6_ejercicio_a_19;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Necesitamos crear un programa para mostrar el ranking de puntuaciones de un
 * torneo de ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las
 * puntuaciones de todos los jugadores (habitualmente valores entre 1000 y 2800,
 * de tipo entero) y luego muestre las puntuaciones en orden descendente (de la
 * más alta a la más baja).
 */
public class UD6_Ejercicio_A_19 {

    public static void main(String[] args) {

        // Creamos el vector con las puntuaciones
        int p[] = new int[8];

        // Pedimos por teclado las puntuaciones
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca las 8 puntuaciones: ");
        for (int i = 0; i < p.length; i++) {
            p[i] = entrada.nextInt();
        }

        // Ordenamos el array (de menor a mayor)
        Arrays.sort(p);

        // Mostramos el array (de mayoir a menor)
        System.out.print("Puntuaciones ordenadas de mayor a menor: ");
        for (int i = p.length - 1; i >= 0; i--) {
            System.out.print(p[i] + " ");
        }
    }

}
