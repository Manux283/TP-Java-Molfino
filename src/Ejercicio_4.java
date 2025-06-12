
import java.util.Scanner;
public class Ejercicio_4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n;
		int contador1 = 0;
		int contador2 = 0;
		
		System.out.println("Ingrese un numero entero positivo: ");
		n = scanner.nextInt();
		
		System.out.println("Numeros pares hasta "+ n + ":");
		
		for(int i=0;i<=n;i++) {
			if(i%2== 0) {
				System.out.print(i + " ");
				
				contador1 += i;
			}
		}
		for(int i=0;i<=n;i++) {
			if(i%2 == 1) {
				contador2 += i;
			}
		}
		System.out.println();
		System.out.println("La suma de los numeros pares es: " + contador1);
		
		System.out.println("La suma de los numeros impares es: " + contador2);
	}

}