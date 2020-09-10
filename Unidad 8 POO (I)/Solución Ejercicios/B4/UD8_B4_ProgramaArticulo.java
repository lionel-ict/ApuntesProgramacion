
public class UD8_B4_ProgramaArticulo {

    public static void main(String[] args) {

        Articulo a1 = new Articulo("Camisa de cuadros", 20, 21, 5);
        Articulo a2 = new Articulo("Pantalón pana", 100, 10, -5);

        System.out.println(a1.nombre + " - Precio: " + a1.precio + "€ - IVA: " + a1.iva + "% - PVP: " + (a1.precio + (a1.precio * a1.iva / 100)) + "€");
        System.out.println(a2.nombre + " - Precio: " + a2.precio + "€ - IVA: " + a2.iva + "% - PVP: " + (a2.precio + (a2.precio * a2.iva / 100)) + "€");

    }
}
