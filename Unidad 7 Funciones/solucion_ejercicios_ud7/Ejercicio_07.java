
import java.util.Scanner;

public class Ejercicio_07 {

    public static double perimetroRectangulo(double ancho, double alto) {
        return (2 * ancho + 2 * alto);
    }

    public static double areaRectangulo(double ancho, double alto) {
        return ancho * alto;
    }

    public static void main(String[] args) {
        double ancho, alto, perimetro, area;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce ancho: ");
        ancho = entrada.nextDouble();
        System.out.print("Introduce alto: ");
        alto = entrada.nextDouble();

        perimetro = perimetroRectangulo(ancho, alto);
        area = areaRectangulo(ancho, alto);

        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);

    }
}
