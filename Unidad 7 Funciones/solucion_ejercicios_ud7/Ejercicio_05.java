
import java.util.Scanner;

public class Ejercicio_05 {

    public static double millas_a_kilometros(double millas) {
        return 1.60934 * millas;
    }

    public static void main(String[] args) {
        double millas, km;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce las millas: ");
        millas = entrada.nextDouble();
        km = millas_a_kilometros(millas);
        System.out.println("Kilómetros: " + km);

    }
}
