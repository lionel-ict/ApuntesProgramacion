
import java.util.Scanner;

public class Ejercicio_17 {

    public static boolean esPrimo(int n) {
        // Si es 1, 0 o negativo => NO ES PRIMO
        if (n <= 1) {
            return false;
        }

        // Desde 2 hasta < n/2
        for (int i = 2; i <= n / 2; i++) {
            // Si n es divisible por i => NO ES PRIMO
            if (n % i == 0) {
                return false;
            }
        }

        // Si la función llega aquí es porque n>1 y en el for
        // no se ha encontrado un nº divisible => SÍ ES PRIMO
        return true;
    }

    public static void main(String[] args) {

        int numero;
        boolean primo;

        Scanner in = new Scanner(System.in);
        
        // Bucle infinito
        while (true) {

            // Pedimos número
            System.out.print("Introduce un número (0 para terminar): ");
            numero = in.nextInt();

            // Si es cero terminamos el bucle (si no, continuamos)
            if (numero == 0) {
                break;
            }

            // Calculamos si es primo
            primo = esPrimo(numero);
            
            // Mostramos mensaje
            if (primo) {
                System.out.println("Es primo.");
            } else {
                System.out.println("No es primo.");
            }
        }
    }
}