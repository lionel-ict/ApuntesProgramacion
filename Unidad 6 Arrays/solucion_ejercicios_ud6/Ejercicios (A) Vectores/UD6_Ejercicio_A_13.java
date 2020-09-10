package ud6_ejercicio_a_13;

import java.util.Scanner;

/**
 * Crea un programa que permita al usuario almacenar una secuencia aritmética en
 * un array y luego mostrarla. Una secuencia aritmética es una serie de números
 * que comienza por un valor inicial V, y continúa con incrementos de I. Por
 * ejemplo, con V=1 e I=2, la secuencia sería 1, 3, 5, 7, 9… Con V=7 e I=10, la
 * secuencia sería 7, 17, 27, 37… El programa solicitará al usuario V, I además
 * de N (nº de valores a crear).
 */
public class UD6_Ejercicio_A_13 {

    public static void main(String[] args) {
        int vini, inc, n;
        int secuencia[];

        // Pedimos valor inicial, incremento y cuántos números
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor inicial: ");
        vini = entrada.nextInt();
        System.out.print("Incremento: ");
        inc = entrada.nextInt();
        System.out.print("Cuántos números: ");
        n = entrada.nextInt();

        // Creamos el vector con la secuencia
        secuencia = new int[n];
        for (int i = 0; i < n; i++) {
            secuencia[i] = vini + (i * inc);
        }

        // Mostramos la secuencia
        System.out.print("Secuencia: ");
        for (int i = 0; i < n; i++) {
            System.out.print(secuencia[i] + " ");
        }
    }
}