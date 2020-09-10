
import java.util.regex.Pattern;

public class Persona {

    private final String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    static final int mayoriaEdad = 18;

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Devuelve si es menor o no
    public boolean esMenor() {
        return this.edad < Persona.mayoriaEdad;
    }

    // Devuelve si es jubilado o no
    public boolean esJubilado() {
        return this.edad >= 65;
    }

    //Devuelve la diferencia de edad entre este objeto y el recibido
    public int diferenciaEdad(Persona p) {
        return this.edad - p.edad;
    }

    public void imprime() {
        System.out.println("DNI: " + this.dni);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellidos: " + this.apellidos);
        System.out.println("Edad: " + this.edad);
    }

    // Funcion que recibe un DNI y devuelve si es valido o no. OJO no comprueba que la letra sea correcta!
    public static boolean validarDNI(String valor) {
        // Expresion regular que indica 8 digitos y al final alguna de las letras que se permiten
        // rangos A-H J-N P-T V-Z (recordad, algunas no se permiten)
        String dniRegexp = "\\d{8}[A-HJ-NP-TV-Z]";
        // Devuelve true si se cumple la expresion regular
        return Pattern.matches(dniRegexp, valor);
    }
}
