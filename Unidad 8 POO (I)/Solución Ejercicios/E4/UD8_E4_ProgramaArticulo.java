
public class UD8_E4_ProgramaArticulo {

    public static void main(String[] args) {

        Articulo a1 = new Articulo("Camisa de cuadros", 20, 21, 5);
        Articulo a2 = new Articulo("Pantalón pana", 100, 21, 10);
        a1.imprimir();
        a2.imprimir();
        System.out.println("");

        a1.setNombre("Chaqueta de lana");
        a1.setPrecio(0);
        a1.setPrecio(30);
        a2.setIva(10);
        a2.setCuantosQuedan(-5);
        a2.setCuantosQuedan(0);
        a1.imprimir();
        a2.imprimir();
        System.out.println("");
        
        if (a1.vender(1000)) {
            System.out.println("He vendido mil!");
        } else {
            System.out.println("No he vendido mil, se cancela la venta por falta de stock");
        }
        
        if (a1.vender(2)) {
            System.out.println("He vendido 2!");
        } else {
            System.out.println("No he vendido 2, se cancela la venta por falta de stock");
        }
        
        System.out.println("Voy a almacenar 3 mas");
        if (a1.almacenar(3)) {
            System.out.println("He almacenado 3!");
        } else {
            System.out.println("No he almacenado 3, no hay sitio");
        }

        a1.imprimir();
        a2.imprimir();
        System.out.println("");

        a1.setIva(5);
        a1.setIva(10);
        a2.setIva(12);
        a2.setIva(4);
        
        a1.imprimir();
        a2.imprimir();

    }
}
