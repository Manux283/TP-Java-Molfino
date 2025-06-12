
import java.util.Scanner;

public class Ejercicio_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] calificaciones = new double[5];
        double suma = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Ingrese una calificacion:");
            calificaciones[i] = scanner.nextDouble();
        }

        for (double nota : calificaciones) {
            suma += nota;
        }

        double promedio = suma / calificaciones.length;
        System.out.println("El promedio es: " + promedio);
    }
}