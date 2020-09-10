/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * Ejercicio 8: Programa que lee una secuencia de números no nulos, terminada
 * con la introducción de un 0, y obtiene e imprime si ha leído algún número
 * negativo, cuantos positivos y cuantos negativos.
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, pos = 0, neg = 0;

        System.out.print("Introduce un número (0 para acabar): ");
        n = entrada.nextInt();

        while (n != 0) {
            if (n < 0) {
                neg++;
            } else {
                pos++;
            }

            System.out.print("Introduce un número: ");
            n = entrada.nextInt();
        }

        if (neg > 0) {
            System.out.println("Se han introducido números negativos.");
        }

        System.out.println("Se han introducido " + pos + " número/s positivo/s.");
        System.out.println("Se han introducido " + neg + " número/s negativo/s.");
    }

}
