
public class Punto {

    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Imprime las coordenadas
    public void imprime() {
        System.out.println("(" + this.x + "," + this.y + ")");
    }

    // Setter de las coordenadas
    public void setXY(int a, int b) {
        this.x = a;
        this.y = b;
    }

    // Desplaza las coordenadas
    public void desplazaXY(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    // Calcula la distancia euclidea entre dos puntos (devuelve double)
    public double distancia(Punto p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
}
