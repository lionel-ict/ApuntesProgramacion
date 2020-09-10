
public class UD8_C1_ProgramPunto {

    public static void main(String[] args) {

        //Instanciamos los tres objetos Punto
        Punto p1 = new Punto(5, 0);
        Punto p2 = new Punto(10, 10);
        Punto p3 = new Punto(-3, 7);

        //Imprimimos las coordenadas de los tres puntos        
        System.out.println("Coordenadas del punto p1 (" + p1.getX() + "," + p1.getY() + ")");
        System.out.println("Coordenadas del punto p2 (" + p2.getX() + "," + p2.getY() + ")");
        System.out.println("Coordenadas del punto p3 (" + p3.getX() + "," + p3.getY() + ")");
        System.out.println();

        //Modificamos las coordenadas de los tres puntos
        p1.setX(p1.getX() + 3);
        p1.setY(6);

        p2.setX(p2.getX() / 2);
        p2.setY(p2.getY() * 2);

        p3.setX(p3.getX() - 5);
        p3.setY(p3.getY() % 2);

        //Imprimimos las coordenadas de los tres puntos               
        System.out.println("Nuevas coordenadas del punto p1 (" + p1.getX() + "," + p1.getY() + ")");
        System.out.println("Nuevas coordenadas del punto p2 (" + p2.getX() + "," + p2.getY() + ")");
        System.out.println("Nuevas coordenadas del punto p3 (" + p3.getX() + "," + p3.getY() + ")");
        System.out.println();
    }

}
