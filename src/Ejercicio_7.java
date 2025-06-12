
import java.util.Scanner;
public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine().toLowerCase();
        int vocales = 0, consonantes = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }
        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
    }
}