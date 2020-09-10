package ud6_ejercicio_a_9;

import java.util.Scanner;

/**
 * Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con
 * valores enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego
 * pedirá un valor N y mostrará en qué posiciones del array aparece N.
 */
public class UD6_Ejercicio_A_9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos array con 100 números [1, 10]
        int vector[] = new int[100];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (1 + Math.random() * 10);
        }

        // Pedimos valor N al usuario
        System.out.print("Introduce valor N a buscar: ");
        double n = entrada.nextInt();

        // Mostramos las posiciones en las que aparece N
        System.out.print("Posiciones donde aparece N:");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == n)
                System.out.print(" " + i);
        }
        
        System.out.println();
    }

}
