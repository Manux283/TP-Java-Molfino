
import java.util.Scanner;
public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int anio = scanner.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("Es un año bisiesto.");
        } else {
            System.out.println("No es un año bisiesto.");
        }
    }
}