
import java.util.Scanner;
public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int numero = scanner.nextInt();
        int suma = 0;
        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
        }
        System.out.println("La suma de los digitos es: " + suma);
    }
}