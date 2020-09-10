
import java.util.Scanner;

/**
 * Ceedcv Ejercicio C_03 Crea un programa que cree una matriz de tamaño NxM
 * (tamaño introducido por teclado) e introduzca en ella NxM valores (también
 * introducidos por teclado). Luego deberá recorrer la matriz y al final mostrar
 * por pantalla cuántos valores son mayores que cero, cuántos son menores que
 * cero y cuántos son igual a cero.
 */
public class C_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, m, menor = 0, mayores = 0, menores = 0, cero = 0;

        System.out.println("Introduce numero de filas");

        n = sc.nextInt();

        System.out.println("Introduce numero de columnas");

        m = sc.nextInt();

        int matriz[][] = new int[n][m];

        for (int i = 0; i < matriz.length; i++) {

            for (int x = 0; x < matriz[0].length; x++) {

                System.out.println("Introduce valor de fila : " + (i + 1) + " Columna: " + (x + 1));

                matriz[i][x] = sc.nextInt();

                if (matriz[i][x] < 0) {
                    menores++;
                } else if (matriz[i][x] > 0) {
                    mayores++;
                } else {
                    cero++;
                }

            }

        }

    }
}
