
public class UD8_A1_ProgramaPunto {

    public static void main(String[] args) {

        //Instanciamos los tres objetos Punto
        Punto p1 = new Punto();
        Punto p2 = new Punto();
        Punto p3 = new Punto();

        p1.x = 5;
        p1.y = 0;

        p2.x = 10;
        p2.y = 10;

        p3.x = -3;
        p3.y = 7;

        //Imprimimos las coordenadas de los tres puntos        
        System.out.println("Coordenadas del punto p1 (" + p1.x + "," + p1.y + ")");
        System.out.println("Coordenadas del punto p2 (" + p2.x + "," + p2.y + ")");
        System.out.println("Coordenadas del punto p3 (" + p3.x + "," + p3.y + ")");
        System.out.println();

        //Modificamos las coordenadas de los tres puntos
        p1.x += 3;
        p1.y = 6;

        p2.x /= 2;
        p2.y *= 2;

        p3.x -= 5;
        p3.y %= 2;

        //Imprimimos las coordenadas de los tres puntos               
        System.out.println("Nuevas coordenadas del punto p1 (" + p1.x + "," + p1.y + ")");
        System.out.println("Nuevas coordenadas del punto p2 (" + p2.x + "," + p2.y + ")");
        System.out.println("Nuevas coordenadas del punto p3 (" + p3.x + "," + p3.y + ")");
        System.out.println();

    }

}
