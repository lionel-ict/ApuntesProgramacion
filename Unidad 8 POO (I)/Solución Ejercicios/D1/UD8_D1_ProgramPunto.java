
public class UD8_D1_ProgramPunto {

    public static void main(String[] args) {

        // Instanciamos los tres objetos Punto
        Punto p1 = new Punto(5, 0);
        Punto p2 = new Punto(10, 10);
        Punto p3 = new Punto(-3, 7);

        // Imprimimos las coordenadas de los tres puntos        
        p1.imprime();
        p2.imprime();
        p3.imprime();
        System.out.println();

        // Modificamos las coordenadas de los tres puntos
        p1.setX(p1.getX() + 3);
        p1.setY(6);
        p2.setX(p2.getX() / 2);
        p2.setY(p2.getY() * 2);
        p3.setX(p3.getX() - 5);
        p3.setY(p3.getY() % 2);

        // Imprimimos las coordenadas de los tres puntos        
        p1.imprime();
        p2.imprime();
        p3.imprime();
        System.out.println();
        
        // Imprimimos distancia entre puntos
        System.out.println("La distancia entre P1 y P2 es " + p1.distancia(p2));
        System.out.println("La distancia entre P2 y P3 es " + p2.distancia(p3));
        System.out.println("La distancia entre P3 y P1 es " + p3.distancia(p1));
        System.out.println();
        
        // Desplazamos p1 y p2. Los imprimimos
        p1.desplazaXY(-1, -1);
        System.out.print("P1 tras desplazarlo -1,-1: ");
        p1.imprime();
        p2.desplazaXY(10, 10);
        System.out.print("P2 tras desplazarlo 10,10: ");
        p2.imprime();
        System.out.println();

    }

}
