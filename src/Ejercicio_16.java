
import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lado1, lado2, lado3;
        System.out.println("Ingrese el primer lado:");
        lado1 = scanner.nextInt();
        System.out.println("Ingrese el segundo lado:");
        lado2 = scanner.nextInt();
        System.out.println("Ingrese el tercer lado:");
        lado3 = scanner.nextInt();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Es un triangulo equilatero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Es un triangulo isosceles");
        } else {
            System.out.println("Es un triangulo escaleno");
        }
    }
}