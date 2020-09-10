//18. -Calcular la suma de los cuadrados de los 5 primeros números naturales.
import java.util.Scanner;

public class _18 {

    public static void main(String[] args) {
        int resultado = 0;
        for (int i = 1; i <= 5; i++) {
            resultado += i * i;
        }

        System.out.println("" + resultado);

    }

}
