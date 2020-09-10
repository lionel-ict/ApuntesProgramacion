
import java.util.Scanner;

public class Ejercicio_18 {

    public static char calculaDNI(int dni) {
        String letra = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letra.charAt(dni % 23);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce nº de DNI: ");
        int dni = in.nextInt();
        char letra = calculaDNI(dni);
        System.out.println("La letra del DNI es: " + letra);
    }

}
