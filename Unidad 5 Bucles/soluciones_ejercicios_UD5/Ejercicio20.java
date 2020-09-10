//20.Codifica un programa que pida un número entero, entre 0 y 20, 
//y que muestre en pantalla una secuencia de números, repitiendo 
//cada número tantas veces como el valor que representa.

import java.util.Scanner;

public class _20 {

    public static void main(String[] args) {
        int numero;

        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un número: ");
        numero = sc.nextInt();
        for (int i = 1; i <= numero; i++) {
            for (int n = 1; n <= i; n++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }

}
