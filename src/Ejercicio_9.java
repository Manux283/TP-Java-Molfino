
import java.util.Scanner;
public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int b = scanner.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int c = scanner.nextInt();
        int mayor = a;
        if (b > mayor) mayor = b;
        if (c > mayor) mayor = c;
        System.out.println("El numero mayor es: " + mayor);
    }
}