
import java.util.Scanner;

public class Ejercicio_10 {

    public static boolean fechacorrecta(int dia, int mes, int anyo) {
        if (dia >= 1 && dia <= 30 && mes >= 1 && mes <= 12) {
            return true;
        }
        else {
            return false;
        }
        // También se puede hacer directamente así
        // return (dia >= 1 && dia <= 30 && mes >= 1 && mes <= 12);
    }

    public static void main(String[] args) {
        int dia, mes, año;
        boolean escorrecta;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor del dia: ");
        dia = entrada.nextInt();
        System.out.print("Valor del mes: ");
        mes = entrada.nextInt();
        System.out.print("Valor del año: ");
        año = entrada.nextInt();
        
        escorrecta = fechacorrecta(dia, mes, año);

        if (escorrecta) {
            System.out.println("La fecha es correcta");
        } else {
            System.out.println("La fecha no es correcta");
        }
    }
}
