//17.-Diseña un algoritmo que lea y acepte únicamente aquellos 
//que sean mayores que el último dado.
//La introducción de números finaliza con la introducción
//de un 0. Al final se mostrará:
//a. El total de números introducidos, excluído el 0.
//b. El número de fallos cometidos.

import java.util.Scanner;

public class _17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, total = 0, fallos = 0, ant = 0;

        System.out.print("Dime un número inicial: ");
        ant = sc.nextInt();
        do {
             total++;
            System.out.print("Dime un número: ");
            n = sc.nextInt();

            if (n <= ant && n != 0) {
                System.out.println("Fallo es menor.");
                fallos++;            

            }
            ant=n;

        } while (n != 0);

        System.out.println("Total de números introducidos: " + total);
        System.out.println("Números fallados: " + fallos);
    }

}
