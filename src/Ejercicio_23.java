
import java.util.Scanner;

public class Ejercicio_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ciudades = {"Buenos Aires", "Cordoba", "Rosario", "Mendoza", "Salta"};
        System.out.println("Ingrese una ciudad:");
        String entrada = scanner.nextLine();
        boolean encontrado = false;

        for (String ciudad : ciudades) {
            if (ciudad.equalsIgnoreCase(entrada)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("La ciudad se encuentra en el arreglo.");
        } else {
            System.out.println("La ciudad NO se encuentra en el arreglo.");
        }
    }
}