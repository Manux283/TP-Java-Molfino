
import java.util.Scanner;

public class Ejercicio_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = scanner.nextLine();
        String[] palabras = frase.trim().split("\s+");
        System.out.println("Numero de palabras: " + palabras.length);
    }
}