
import java.util.Scanner;
import java.util.Random;

public class Ejercicio_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        System.out.println("Ingrese la longitud de la contrasena:");
        int longitud = scanner.nextInt();
        String contrasena = "";

        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            contrasena += caracteres.charAt(indice);
        }

        System.out.println("Contrasena generada: " + contrasena);
    }
}