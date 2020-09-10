package ud6_ejercicio_a_7;

import java.util.Scanner;

/**
 * Crea un programa que pida dos valores enteros P y Q, luego cree un array que
 * contenga todos los valores desde P hasta Q, y lo muestre por pantalla.
 */
public class UD6_Ejercicio_A_7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor inicial P: ");
        int p = entrada.nextInt();
        System.out.print("Valor final Q: ");
        int q = entrada.nextInt();

        // Creamos el array de tamaño (Q - P + 1)
        int vector[] = new int[q - p + 1];
        
        // En cada posición (i) insertamos (P + i)
        for (int i = 0; i < vector.length; i++) {
            vector[i] = p + i;
        }

        // Mostramos el array
        System.out.print("Array: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }

}
