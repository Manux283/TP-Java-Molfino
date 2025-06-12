
import java.util.Scanner;

public class Ejercicio_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {4, 7, 1, 8, 3, 9, 2, 6, 5, 10};
        System.out.println("Ingrese un numero:");
        int x = scanner.nextInt();
        int contador = 0;

        for (int num : numeros) {
            if (num > x) {
                contador++;
            }
        }

        System.out.println("Cantidad de numeros mayores a " + x + ": " + contador);
    }
}