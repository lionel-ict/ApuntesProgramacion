
import java.util.Scanner;
/**
 * Ceedcv
 * Ejercicio C_04 Necesitamos crear un programa para almacenar las notas de 
 * 4 alumnos (llamados “Alumno1”, “Alumno 2”, etc.) y 5 asignaturas. 
 * El usuario introducirá las notas por teclado y luego 
 * elprograma mostrará la nota mínima, máxima y media de cada alumno.
 */
public class C_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        float notas[][]= new float[4][5];
        float minima=0,maxima=0,media=0,suma=0;
        
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                System.out.print("Para el alumno "+(i+1)+" dime su nota "+(j+1)+": ");
                notas[i][j]=sc.nextFloat();
                suma+= notas[i][j];
                if (j==0) {
                    minima=notas[i][j];
                    maxima=notas[i][j];
                }
                if(minima>notas[i][j]){
                    minima=notas[i][j];
                }
                if(maxima<notas[i][j]){
                    maxima=notas[i][j];
                }
            }
            System.out.println("La nota mínima del alumno "+(i+1)+" es: "+minima);
            System.out.println("La nota máxima del alumno "+(i+1)+" es: "+maxima);
            System.out.println("La nota media del alumno "+(i+1)+" es: "+ (suma/5));
            suma=0;
            System.out.println("");
        }
        
    }
}