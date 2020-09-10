package ud6_ejercicio_a_3;

import java.util.Scanner;

/**
 * Crea un programa que pida diez números reales por teclado, los almacene en un
 * array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por
 * pantalla.
 */
public class UD6_Ejercicio_A_3 {

    public static void main(String[] args) {
        double valores[] = new double[10];
        Scanner entrada = new Scanner(System.in);

        // Introducimos todos los valores en el array
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Introduce valor " + i + ": ");
            valores[i] = entrada.nextDouble();
        }

        // Averiguamos máximo y mínimo
        double max = valores[0], min = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > max)
                max = valores[i];
            else if (valores[i] < min)
                min = valores[i];
        }
        
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
    }
}