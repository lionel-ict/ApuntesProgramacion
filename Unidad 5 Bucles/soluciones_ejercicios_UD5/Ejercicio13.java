/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * Ejercicio 13: Programa donde el usuario "piensa" un número del 1 al 100 y el
 * ordenador lo adivina. (el usuario debe indicarle al ordenador si es mayor,
 * menor o igual).
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num, max, min, anterior;
        boolean seguir;
        char respuesta;

        seguir = true;
        max = 100;
        min = 1;
        anterior = 0;

        while (seguir) // Equivalente a (seguir == true)
        {
            num = (max + min) / 2;

            if (num == anterior) {
                num++;
            } // Entender para que se utiliza.

            System.out.print("El número es " + num + "? (Escribe: =, < o >): ");
            respuesta = entrada.nextLine().charAt(0); // Leemos un caracter.

            switch (respuesta) {
                case '<':
                    max = num;
                    anterior = num;
                    break;
                case '=':
                    seguir = false;
                    break;
                case '>':
                    min = num;
                    anterior = num;
                    break;
            }
        }

        System.out.println("Lo acerte!!");
    }

}
