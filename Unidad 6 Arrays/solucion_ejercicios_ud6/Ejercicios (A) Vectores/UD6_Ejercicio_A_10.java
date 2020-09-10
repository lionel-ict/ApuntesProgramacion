package ud6_ejercicio_a_10;

import java.util.Scanner;

/**
 * Crea un programa para realizar cálculos relacionados con la altura (en
 * metros) de personas. Pedirá un valor N y luego almacenará en un array N
 * alturas introducidas por teclado. Luego mostrará la altura media, máxima y
 * mínima así como cuántas personas miden por encima y por debajo de la media.
 */
public class UD6_Ejercicio_A_10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos nº de alturas y creamos vector
        System.out.print("¿Cuántas alturas a introducir?: ");
        int n = entrada.nextInt();
        double alturas[] = new double[n];

        // Pedimos alturas al usuario e introducimos en array
        System.out.print("Introduce las alturas de una en una: ");
        for (int i = 0; i < alturas.length; i++) {
            alturas[i] = entrada.nextDouble();
        }
        
        // Calculamos media, máximo y mínimo
        double suma = 0, media, max = alturas[0], min = alturas[0];
        for (int i = 0; i < alturas.length; i++) {
            suma += alturas[i];
            if (alturas[i] > max) max = alturas[i];
            if (alturas[i] < min) min = alturas[i];
        }
        media = suma / n;

        // Calculamos cuantas alturas por encima y debajo de la media
        int encima = 0, debajo = 0;
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] > media) encima++;
            if (alturas[i] < media) debajo++;
        }

        // Mostramos los datos
        System.out.println("Altura media:  " + media);
        System.out.println("Altura máxima: " + max);
        System.out.println("Altura mínima: " + min);
        System.out.println("Alturas por encima de la media: " + encima);
        System.out.println("Alturas por debajo de la media: " + debajo);
    }

}
