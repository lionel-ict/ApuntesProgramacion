//15.-Imprimir y contar los múltiplos de 3 desde la unidad hasta un número que introducimos por teclado.

import java.util.Scanner;

public class _15 {

    public static void main(String[] args) {
        int cuenta, n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un número: ");
        n = sc.nextInt();
        cuenta=0;

        for (int i = 3; i <= n; i = i + 3) {
            cuenta++;

        }

        System.out.println("Cantidad de multiplos de 3: " + cuenta);

    }

}
