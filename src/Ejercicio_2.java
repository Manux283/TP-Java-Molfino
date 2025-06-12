
public class Ejercicio_2 { 
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
			
		for(int i=50;i<101;i++) {
				if(esPrimo(i)) {
					System.out.println(i + ": es primo");
				}else {
					System.out.print (i + ": ");
					for(int j=1;j<=i;j++) {
						
						if( i%j == 0 ) {
							System.out.print ( j + " ");
						}
					}
					System.out.println();
					}
				}
		}
	}