/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * Ejercicio 10: Programa que lee una secuencia de notas (con valores que van de
 * 0 a 10) que termina con el valor -1 y nos dice si hubo o no alguna nota con
 * valor 10.
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float nota;
        boolean hay10 = false;

        System.out.print("Introduce una nota entre 0 y 10 (-1 para salir): ");
        nota = entrada.nextFloat();

        while (nota != -1) {
            if (nota == 10) {
                hay10 = true;
            }

            System.out.print("Introduce una nota entre 0 y 10 (-1 para salir): ");
            nota = entrada.nextFloat();
        }

        if (hay10) // equivalente a hay10==true
        {
            System.out.println("Hay al menos una nota de 10");
        } else {
            System.out.println("No hay notas de 10");
        }
    }

}
