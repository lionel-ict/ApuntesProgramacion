//19.-Diseñar un algoritmo que lee un número y seguidamente escribe el carácter “*”, 
//un número de veces igual al valor numérico leído.
//En aquellos casos en que el valor leído no sea positivo
//se deberá escribir un único asterisco.

import java.util.Scanner;

public class _19 {

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un número: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
        System.out.println("");

        if (n < 0) {
            System.out.println("*");
        }

    }

}
