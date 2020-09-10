
import java.util.Scanner;

public class UD8_D2_ProgramaPersona {

    public static void main(String[] args) {

        // Instanciamos personas
        Persona persona1 = new Persona("18999548P", "José", "Serrano Márquez", 25);
        Persona persona2 = new Persona("20222444L", "María", "Carcelén Sánchez", 17);

        // Imprimimos p1 y p2
        persona1.imprime();
        persona2.imprime();
        System.out.println("");

        // Realizamos algunos cambios
        persona1.setNombre("Juan");
        persona1.setEdad(11);
        persona2.setNombre("Carmen");
        persona2.setEdad(33);

        // Imprimimos p1 y p2
        persona1.imprime();
        persona2.imprime();
        System.out.println("");

        // Imprimomos diferencia de edad
        System.out.println("La diferencia de edad es " + persona1.diferenciaEdad(persona2));
    }

}
