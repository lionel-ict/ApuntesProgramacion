public class Ejercicio_15 {

    public static int suma_vector(int[] v) {
        int suma = 0;
        for (int i = 0; i < v.length; i++) {
            suma += v[i];
        }
        return suma;
    }

    public static double media_vector(int[] v) {
        return (double)suma_vector(v) / (double)v.length;
    }

    public static void main(String[] args) {
        int array[] = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
        System.out.println("Suma: " + suma_vector(array));
        System.out.println("Media: " + media_vector(array));
    }
}
