
import java.util.Scanner;
public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione conversion: 1. Celsius a Fahrenheit 2. Fahrenheit a Celsius");
        int opcion = scanner.nextInt();
        System.out.print("Ingrese el valor: ");
        double valor = scanner.nextDouble();
        if (opcion == 1) {
            System.out.println("Fahrenheit: " + (valor * 9 / 5 + 32));
        } else if (opcion == 2) {
            System.out.println("Celsius: " + ((valor - 32) * 5 / 9));
        } else {
            System.out.println("Opcion invalida.");
        }
    }
}