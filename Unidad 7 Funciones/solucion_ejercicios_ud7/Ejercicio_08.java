
import java.util.Scanner;

public class Ejercicio_08 {

    public static int suma1aN(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    public static int producto1aN(int n) {
        int prod = 1;
        for (int i = 1; i <= n; i++) {
            prod *= i;
        }
        return prod;
    }

    public static double intermedio1aN(int n) {
        return (1.0 + (double) n) / 2.0;
    }

    public static void main(String[] args) {
        int n;
        double suma, prod, inter;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce N: ");
        n = entrada.nextInt();
        suma = suma1aN(n);
        prod = producto1aN(n);
        inter = intermedio1aN(n);

        System.out.println("Suma de 1 a N: " + suma);
        System.out.println("Producto de 1 a N: " + prod);
        System.out.println("Intermedio de 1 a N: " + inter);
    }
}
