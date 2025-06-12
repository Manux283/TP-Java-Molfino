
import java.util.Scanner;
public class Ejercicio_3 {	
	public static boolean esPrimo(int numero) {
		    int resto = 0;
		    
		    for (int i = 1; i <= numero; i++) {
		        if (numero % i == 0) {
		            resto++;
		        }
		        if (resto > 2) {
		            return false;
		        }
		    }
		    
		    return resto == 2;
		}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero;
		
		do {
		System.out.println("Ingrese un numero: ");
		
		numero = scanner.nextInt();
		} while (!(numero > 100 && esPrimo(numero)));
		
		
	}

}
