import java.util.Scanner;

public class Ejercicio_25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una operación: +  -  *  /");
        String operacion = scanner.nextLine();

        System.out.println("Ingrese la cantidad de numeros:");
        int cantidad = scanner.nextInt();

        double resultado = 0;
        double numero;

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ":");
            numero = scanner.nextDouble();

            if (i == 0) {
                resultado = numero;
            } else {
                switch (operacion) {
                    case "+":
                        resultado += numero;
                        break;
                    case "-":
                        resultado -= numero;
                        break;
                    case "*":
                        resultado *= numero;
                        break;
                    case "/":
                        if (numero != 0) {
                            resultado /= numero;
                        } else {
                            System.out.println("No se puede dividir por 0. Se omite este número.");
                        }
                        break;
                    default:
                        System.out.println("Operación no válida.");
                        return;
                }
            }
        }

        System.out.println("El resultado es: " + resultado);
    }
}