//16. Escribir un programa en java que pida un número entero positivo y nos diga si es primo o no.

import java.util.Scanner;

public class _16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, contador;
        boolean esprimo = true;;

        do {
            System.out.print("Dime un número: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("El número debe ser entero y positivo");
            }
        } while (n <= 0);

        contador = n - 1;
        while (esprimo == true && contador > 1) {
            if (n % contador == 0) {
                esprimo = false;
            }
            contador--;
        }

        if (esprimo) {
            System.out.println("Es primo.");
        } else {
            System.out.println("No es primo.");
        }

    }

}
