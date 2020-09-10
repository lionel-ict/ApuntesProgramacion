public class ProgramaInventario {
    
    public static void main(String args[]) {
        
        // Creamos unas cuantas mascotas
        Perro p1 = new Perro("Bobby", 5, "jugando", "Feb-2015", "Pastor alemán", false);
        Perro p2 = new Perro("Lulu", 7, "durmiendo", "Abril-2013", "Rottweiler", false);
        Gato g1 = new Gato("Luna", 2, "durmiendo", "Sept-2018", "negro", false);
        Gato g2 = new Gato("Pecas", 2, "rascandose", "Julio-2018", "blanco", true);
        Loro l1 = new Loro("Arturito", 10, "hablando", "Enero-2010", "largo", true, "Murcia", true);
        Canario c1 = new Canario("Basilio", 5, "piando", "Dic-2015", "corto", true, "amarillo", true);
        
        // Creamos inventario
        Inventario inventario = new Inventario();
        
        // Añadimos mascotas al inventario
        inventario.insertarAnimal(p1);
        inventario.insertarAnimal(p2);
        inventario.insertarAnimal(g1);
        inventario.insertarAnimal(g2);
        inventario.insertarAnimal(l1);
        inventario.insertarAnimal(c1);
        
        // Mostramos lista de animales
        inventario.mostrarListaAnimales();
        System.out.println("");
        
        // Mostramos todos los animales
        inventario.mostrarTodosAnimales();
        
        // Eliminamos un par de mascotas
        inventario.eliminarAnimal(1);
        inventario.eliminarAnimal(2);
        
        // Mostramos lista de animales
        inventario.mostrarListaAnimales();
        System.out.println("");
        
    }
    
}
