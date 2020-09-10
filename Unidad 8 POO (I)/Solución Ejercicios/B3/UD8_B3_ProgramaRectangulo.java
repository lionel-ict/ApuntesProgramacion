
public class UD8_B3_ProgramaRectangulo {

    public static void main(String[] args) {

        Rectangulo rec1 = new Rectangulo(0, 0, 5, 5);
        Rectangulo rec2 = new Rectangulo(7, 9, 2, 3);

        System.out.println("Coordenadas del rectángulo 1 (" + rec1.x1 + "," + rec1.y1 + ") y (" + rec1.x2 + "," + rec1.y2 + ")");
        System.out.println("Coordenadas del rectángulo 2 (" + rec2.x1 + "," + rec2.y1 + ") y (" + rec2.x2 + "," + rec2.y2 + ")");
        System.out.println("El perímetro del rectángulo 1 es: " + perimetro(rec1));
        System.out.println("El perímetro del rectángulo 2 es: " + perimetro(rec2));
        System.out.println("El área del rectángulo 1 es: " + area(rec1));
        System.out.println("El área del rectángulo 2 es: " + area(rec2));
        System.out.println("");

    }

    public static double perimetro(Rectangulo rect) {
        int lado1 = Math.abs(rect.x1 - rect.x2);
        int lado2 = Math.abs(rect.y1 - rect.y2);

        return (lado1 + lado2) * 2;
    }

    public static double area(Rectangulo rect) {
        int lado1 = Math.abs(rect.x1 - rect.x2);
        int lado2 = Math.abs(rect.y1 - rect.y2);

        return lado1 * lado2;
    }

}
