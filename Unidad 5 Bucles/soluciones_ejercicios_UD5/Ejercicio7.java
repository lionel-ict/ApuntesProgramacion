/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * Ejercicio 7: Programa que lee 10 números no nulos y visualice un mensaje
 * indicando cuántos son positivos y cuantos negativos.
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cont, num, pos, neg;
        final int maximo = 10; // El ejercicio es sobre 10 números pero podéis cambiar su valor para hacer pruebas

        pos = 0;
        neg = 0;

        for (cont = 1; cont <= maximo; cont++) {
            System.out.print("Introduce el número " + cont + " de " + maximo + ": ");
            num = entrada.nextInt();

            if (num < 0) {
                neg++;
            } else {
                pos++;
            }
        }

        System.out.println("Se han introducido " + pos + " número/s positivo/s.");
        System.out.println("Se han introducido " + neg + " número/s negativo/s.");
    }

}
