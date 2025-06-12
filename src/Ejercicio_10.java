
import java.util.Scanner;
public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero no negativo: ");
        int n = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("El factorial es: " + factorial);
    }
}