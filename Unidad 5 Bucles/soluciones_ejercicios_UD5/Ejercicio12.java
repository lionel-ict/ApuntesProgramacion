/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * Ejercicio 12: Programa que calcula el valor de elevar (sin hacer uso del
 * operador de potencia) un número real, A, a un número exponente entero, B.
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float numA, potencia;
        int numB, cont, veces; // Utilizamos la variable veces para saber el número de iteraciones del bucle.

        potencia = 1;

        System.out.print("Introduce el número A (real): ");
        numA = entrada.nextFloat();

        System.out.print("Introduce el número B (entero): ");
        numB = entrada.nextInt();

        if (numB < 0) {
            veces = -numB; // Si el exponente es negativo lo convertimos a positivo.
        } else {
            veces = numB;
        }

        for (cont = 1; cont <= veces; cont++) {
            potencia = potencia * numA;
        }

        if (numB < 0) {
            potencia = 1 / potencia;
        }

        System.out.println(numA + " elevado a " + numB + " es " + potencia);
    }

}
