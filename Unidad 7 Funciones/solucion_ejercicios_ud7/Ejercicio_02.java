
import java.util.Scanner;

public class Ejercicio_02 {

    public static boolean esMayorEdad(int a) {
        if (a >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int x;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        x = entrada.nextInt();

        if (esMayorEdad(x)) {
            System.out.println("Eres mayor de edad");

        } else {
            System.out.println("No eres mayor de edad");
        }
    }

}
