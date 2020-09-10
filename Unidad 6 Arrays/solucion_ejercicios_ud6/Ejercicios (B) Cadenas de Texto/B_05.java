/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * Ejercicio 5: Programa que lee una frase por teclado e indica si la frase es
 * un palíndromo o no lo es.
 */
public class B_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        boolean palindromo = true;

        // Suponemos que la frase no tiene acentos ni signos de puntuación.
        System.out.print("Introduce una frase: ");

        frase = sc.nextLine();
        frase = frase.replace(" ", "");
        frase = frase.toUpperCase();
        int longitud = frase.length();

        for (int i = 0; i < longitud && palindromo; i++) {
            // comparamos el carácter de la posición i con el de la última posición - i
            if (frase.charAt(i) != frase.charAt((longitud - 1) - i)) {
                palindromo = false;
            }
        }

        if (palindromo) {
            System.out.println("La frase es palindromo");
        } else {
            System.out.println("La frase no es palindromo");
        }
    }

}
