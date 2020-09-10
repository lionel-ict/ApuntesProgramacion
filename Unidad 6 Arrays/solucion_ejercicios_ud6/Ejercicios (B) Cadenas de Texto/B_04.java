/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * Ejercicio B-04: Crea un programa que muestre por pantalla cuantas vocales 
 * de cada tipo hay (cuantas ‘a’,cuantas  ‘e’,  etc.)  en una  frase  
 * introducida  por  teclado. No  se  debe   diferenciar 
 * entremayúsculas y minúsculas. Por ejemplo dada la frase 
 * “Mi mama me mima” 
 * dirá que hay:
 * Nº de A's: 3
 * Nº de E's: 1
 * Nº de I's: 2
 * Nº de O's: 0
 * Nº de U's: 0
 */
public class B_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String frase;
        int a, e, i, o, u, cont;
        char c;
        a = 0;
        e = 0;
        i = 0;
        o = 0;
        u = 0;

        System.out.print("Introduce una frase: ");
        frase = in.nextLine();

        frase = frase.toLowerCase(); // Pasamos todo a minúsculas.

        for (cont = 0; cont < frase.length(); cont++) {
            switch (frase.charAt(cont)) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
            }
        }

        System.out.println("El número de 'a' es: " + a);
        System.out.println("El número de 'e' es: " + e);
        System.out.println("El número de 'i' es: " + i);
        System.out.println("El número de 'o' es: " + o);
        System.out.println("El número de 'u' es: " + u);

    }

}
