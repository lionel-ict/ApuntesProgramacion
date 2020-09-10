package ud6_ejercicio_a_8;

import java.util.Scanner;

/**
 * Crea un programa que cree un array con 100 números reales aleatorios entre
 * 0.0 y 1.0, utilizando Math.random(), y luego le pida al usuario un valor real
 * R. Por último, mostrará cuántos valores del array son igual o superiores a R.
 */
public class UD6_Ejercicio_A_8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos array con 100 números [0.0, 1.0[
        double vector[] = new double[100];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Math.random();
        }

        // Pedimos valor R al usuario
        System.out.print("Introduce un número real de 0.0 a 1.0: ");
        double r = entrada.nextDouble();

        // Calculamos cuantos números son mayores o igual a R
        int cuantos = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] >= r)
                cuantos++;
        }

        System.out.println("Cantidad de números mayores o iguales: " + cuantos);
    }

}
