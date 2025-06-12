
import java.util.Scanner;
public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase: ");
        String texto = scanner.nextLine();
        String invertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }
        System.out.println("Texto invertido: " + invertido);
    }
}