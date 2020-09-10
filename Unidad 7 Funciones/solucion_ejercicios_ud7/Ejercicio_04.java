
import java.util.Scanner;

public class Ejercicio_04 {

    public static int dimeSigno(int a) {
        int r;
        if (a < 0) {
            r = -1;
        } else if (a == 0) {
            r = 0;
        } else {
            r = 1;
        }
        return r;
    }

    public static void main(String[] args) {
        int x, y, min;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        x = entrada.nextInt();

        switch (dimeSigno(x)) {
            case -1:
                System.out.println("Es negativo");
                break;
            case 0:
                System.out.println("Es cero");
                break;
            case 1:
                System.out.println("Es positivo");
                break;

        }

    }

}
