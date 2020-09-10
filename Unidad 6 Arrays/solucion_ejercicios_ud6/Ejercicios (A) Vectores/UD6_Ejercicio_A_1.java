package ud6_ejercicio_a_1;

import java.util.Scanner;

/**
 * Crea un programa que pida diez números reales por teclado, los almacene en un
 * array, y luego muestre todos sus valores.
 */
public class UD6_Ejercicio_A_1 {

    public static void main(String[] args) {
        double valores[] = new double[10];
        Scanner entrada = new Scanner(System.in);

        // Introducimos todos los valores en el array
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Introduce valor " + i + ": ");
            valores[i] = entrada.nextDouble();
        }

        // Mostramos todos los valores del array
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Valor " + i + ": " + valores[i]);
        }
    }
}