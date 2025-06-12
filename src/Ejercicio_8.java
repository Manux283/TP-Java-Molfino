
import java.util.Scanner;
public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = (int)(Math.random() * 100) + 1;
        int intento, contador = 0;
        do {
            System.out.print("Adivina el numero entre 1 y 100: ");
            intento = scanner.nextInt();
            contador++;
            if (intento < numeroSecreto) {
                System.out.println("El numero es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El numero es menor.");
            }
        } while (intento != numeroSecreto);
        System.out.println("Correcto! Lo lograste en " + contador + " intentos.");
    }
}