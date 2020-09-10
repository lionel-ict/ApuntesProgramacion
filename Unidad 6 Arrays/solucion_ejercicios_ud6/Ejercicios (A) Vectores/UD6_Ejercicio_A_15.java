package ud6_ejercicio_a_15;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Crea un programa que pida la usuario dos valores N y M y luego cree un array
 * de tamaño N que contenga M en todas sus posiciones. Luego muestra el array
 * por pantalla.
 */
public class UD6_Ejercicio_A_15 {

    public static void main(String[] args) {
        
        // Pedimos tamaño (n) y valor (m)
        Scanner entrada = new Scanner(System.in);
        System.out.print("Tamaño del vector: ");
        int n = entrada.nextInt();
        System.out.print("Valor a introducir: ");
        int m = entrada.nextInt();

        // Creamos el array
        int vector[] = new int[n];
        
        // Insertamos m en todas sus posiciones
        Arrays.fill(vector, m);

        // Mostramos el array
        String arrayStr = Arrays.toString(vector);
        System.out.println("Array: " + arrayStr);
    }

}
