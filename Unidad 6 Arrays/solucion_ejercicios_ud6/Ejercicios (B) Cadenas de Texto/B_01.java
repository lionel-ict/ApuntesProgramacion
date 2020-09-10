/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * Crea un programa que pida una cadena de texto por teclado y 
 * luego muestre cada palabra de la cadena en una línea distinta.
 */
public class B_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase;
        String[] frase_dividida;
        int i;

        System.out.print("Introduce la frase: ");
        frase = sc.nextLine();

        frase_dividida = frase.split(" "); // El método 'split' devuelve el resultado en un vector de Strings. 

        System.out.println("La frase dividida es: ");

        for (i = 0; i < frase_dividida.length; i++) {
            System.out.println(frase_dividida[i]);
        }

    }

}
