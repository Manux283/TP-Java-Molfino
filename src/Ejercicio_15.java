
import java.util.Scanner;
public class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000;
        int opcion;
        do {
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: $" + saldo);
                    break;
                case 2:
                    System.out.print("Ingrese monto a depositar: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    break;
                case 3:
                    System.out.print("Ingrese monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    if (retiro <= saldo) {
                        saldo -= retiro;
                    } else {
                        System.out.println("Fondos insuficientes.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 4);
    }
}