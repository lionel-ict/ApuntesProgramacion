/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * Ejercicio 6: Programa que lee 10 números no nulos y visualice un mensaje de
 * si ha leído algún número negativo o no.
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont, num;
        boolean negativo;
        final int maximo = 10; // El ejercicio es sobre 10 números pero podéis cambiar su valor para hacer pruebas

        negativo = false;

        for (cont = 1; cont <= maximo; cont++) {
            System.out.print("Introduce el número " + cont + " de " + maximo + ": ");
            num = entrada.nextInt();

            if (num < 0) {
                negativo = true;
            }
        }

        if (!negativo) // equivale a (negativo == false)
        {
            System.out.print("No ");
        }

        System.out.println("se han introducido números negativos.");
    }

}
