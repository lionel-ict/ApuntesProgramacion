
public class UD8_D3_ProgramaRectangulo {

    public static void main(String[] args) {

        // Instanciamos e imprimimos rectángulos
        Rectangulo rec1 = new Rectangulo(0, 0, 5, 5);
        Rectangulo rec2 = new Rectangulo(7, 9, 2, 3);
        rec1.imprime();
        rec2.imprime();

        // Cambiamos valores e imprimimos
        rec1.setX1(10);
        rec1.setX2(3);
        rec2.setY1(12);
        rec2.setY2(5);
        rec1.imprime();
        rec2.imprime();

        // Cambiamos valores e imprimimos
        rec1.setX1Y1(2, 4);
        rec1.setX2Y2(10, 20);
        rec2.setAll(3, 4, 5, 6);
        rec1.imprime();
        rec2.imprime();
    }
}
