//21. Introducir A y B (que sea mayor que A). Visualizar los números de A hasta B e indicar cuantos hay que sean pares.
import java.util.Scanner;

public class _21 {

    public static void main(String[] args) {

        int a, b, pares = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un número: ");
        a = sc.nextInt();
        System.out.print("Dime otro número mayor al anterior: ");
        b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) {
                pares++;
            }
        }
        System.out.println("\nLa cantidad de pares son: " + pares);
    }

}
