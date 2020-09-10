
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Ceedcv
 *
 * @author javier
 */
public class _22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int x = 1, s = 1;
        System.out.print("Dime un número para realizar su pirámide: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) { //para filas
            for (int j = x; j <= n; j++) { //espacios en blanco en cada fila
                System.out.print(" ");
            }
            for (int l = 1; l <= s; l++) { //asteriscos en cada fila
                System.out.print("*");
            }

            s += 2;
            x++;
            System.out.println("");
        }
    }
}
