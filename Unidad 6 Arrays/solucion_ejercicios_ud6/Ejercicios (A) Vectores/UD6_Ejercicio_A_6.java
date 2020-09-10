package ud6_ejercicio_a_6;

import java.util.Scanner;

/**
 * Crea un programa que pida dos valores enteros N y M, luego cree un array de
 * tamaño N, escriba M en todas sus posiciones y lo muestre por pantalla.
 */
public class UD6_Ejercicio_A_6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Tamaño del vector: ");
        int n = entrada.nextInt();
        System.out.print("Valor a introducir: ");
        int m = entrada.nextInt();

        // Creamos el array e inserta m en todas sus posiciones
        int vector[] = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = m;
        }

        // Mostramos el array
        System.out.print("Array: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }
}