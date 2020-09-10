
import java.util.Scanner;

public class Ejercicio_09 {

    public static int maximo(int a, int b) {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
        // También se puede hacer con el operador ternario '?' así:
        // return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        int a, b, c, max;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Valor 1: ");
        a = entrada.nextInt();
        System.out.print("Valor 2: ");
        b = entrada.nextInt();
        System.out.print("Valor 3: ");
        c = entrada.nextInt();
        
        max = maximo(a, b);
        max = maximo(max, c);

        System.out.println("Máximo: " + max);
    }
}
