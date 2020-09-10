
public class UD8_A3_ProgramaRectangulo {

    public static void main(String[] args) {

        Rectangulo rec1 = new Rectangulo();
        Rectangulo rec2 = new Rectangulo();

        rec1.x1 = 0;
        rec1.y1 = 0;
        rec1.x2 = 5;
        rec1.y2 = 5;

        rec2.x1 = 7;
        rec2.y1 = 9;
        rec2.x2 = 2;
        rec2.y2 = 3;

        System.out.println("Coordenadas del rectángulo 1 (" + rec1.x1 + "," + rec1.y1 + ") y (" + rec1.x2 + "," + rec1.y2 + ")");
        System.out.println("Coordenadas del rectángulo 2 (" + rec2.x1 + "," + rec2.y1 + ") y (" + rec2.x2 + "," + rec2.y2 + ")");
        System.out.println("El perímetro del rectángulo 1 es: " + perimetro(rec1));
        System.out.println("El perímetro del rectángulo 2 es: " + perimetro(rec2));
        System.out.println("El área del rectángulo 1 es: " + area(rec1));
        System.out.println("El área del rectángulo 2 es: " + area(rec2));
        System.out.println("");

        rec1.x1 = 5;
        rec1.y1 = 5;
        rec1.x2 = 15;
        rec1.y2 = 15;

        rec2.x1 = 17;
        rec2.y1 = 19;
        rec2.x2 = 22;
        rec2.y2 = 24;

        System.out.println("Coordenadas del rectángulo 1 (" + rec1.x1 + "," + rec1.y1 + ") y (" + rec1.x2 + "," + rec1.y2 + ")");
        System.out.println("Coordenadas del rectángulo 2 (" + rec2.x1 + "," + rec2.y1 + ") y (" + rec2.x2 + "," + rec2.y2 + ")");
        System.out.println("El perímetro del rectángulo 1 es: " + perimetro(rec1));
        System.out.println("El perímetro del rectángulo 2 es: " + perimetro(rec2));
        System.out.println("El área del rectángulo 1 es: " + area(rec1));
        System.out.println("El área del rectángulo 2 es: " + area(rec2));

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
