package ud6_ejercicio_a_5;

import java.util.Scanner;

/**
 * Crea un programa que pida veinte números reales por teclado, los almacene en
 * un array y luego lo recorra para calcular y mostrar la media: (suma de
 * valores) / nº de valores.
 */
public class UD6_Ejercicio_A_5 {

    public static void main(String[] args) {
        double valores[] = new double[10];
        Scanner entrada = new Scanner(System.in);
        
        // Introducimos todos los valores en el array
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Introduce valor " + i + ": ");
            valores[i] = entrada.nextDouble();
        }
        
        // Recorremos el array para calcular la suma
        double suma = 0;
        for (int i = 0; i < valores.length; i++) {
            suma += valores[i];
        }
        
        // Calculamos y mostramos la media
        double media = suma / valores.length;
        System.out.println("Media: " + media);
    }
}