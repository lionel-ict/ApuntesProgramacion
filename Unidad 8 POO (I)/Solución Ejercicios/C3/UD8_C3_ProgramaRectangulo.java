
public class UD8_C3_ProgramaRectangulo {

    public static void main(String[] args) {

        Rectangulo rec1 = new Rectangulo(0, 0, 5, 5);
        Rectangulo rec2 = new Rectangulo(7, 9, 2, 3);

        System.out.println("Coordenadas del rectángulo 1 (" + rec1.getX1() + "," + rec1.getY1() + ") y (" + rec1.getX2() + "," + rec1.getY2() + ")");
        System.out.println("Coordenadas del rectángulo 2 (" + rec2.getX1() + "," + rec2.getY1() + ") y (" + rec2.getX2() + "," + rec2.getY2() + ")");
        System.out.println("El perímetro del rectángulo 1 es: " + perimetro(rec1));
        System.out.println("El perímetro del rectángulo 2 es: " + perimetro(rec2));
        System.out.println("El área del rectángulo 1 es: " + area(rec1));
        System.out.println("El área del rectángulo 2 es: " + area(rec2));
        System.out.println("");

        rec1.setX1(10);
        rec1.setX2(3);

        rec2.setY1(12);
        rec2.setY2(5);

        System.out.println("Coordenadas del rectángulo 1 (" + rec1.getX1() + "," + rec1.getY1() + ") y (" + rec1.getX2() + "," + rec1.getY2() + ")");
        System.out.println("Coordenadas del rectángulo 2 (" + rec2.getX1() + "," + rec2.getY1() + ") y (" + rec2.getX2() + "," + rec2.getY2() + ")");
        System.out.println("El perímetro del rectángulo 1 es: " + perimetro(rec1));
        System.out.println("El perímetro del rectángulo 2 es: " + perimetro(rec2));
        System.out.println("El área del rectángulo 1 es: " + area(rec1));
        System.out.println("El área del rectángulo 2 es: " + area(rec2));
        System.out.println("");

    }

    public static double perimetro(Rectangulo rect) {
        int lado1 = Math.abs(rect.getX1() - rect.getX2());
        int lado2 = Math.abs(rect.getY1() - rect.getY2());

        return (lado1 + lado2) * 2;
    }

    public static double area(Rectangulo rect) {
        int lado1 = Math.abs(rect.getX1() - rect.getX2());
        int lado2 = Math.abs(rect.getY1() - rect.getY2());

        return lado1 * lado2;
    }

}
