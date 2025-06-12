
public class Ejercicio_24 {
    public static void main(String[] args) {
        String[] animales = {"perro", "gato", "caballo", "conejo"};
        System.out.println("Ejemplo de for-each:");
      
     // Uso un for-each para recorrer el arreglo
     // En cada vuelta, la variable 'animal' toma el valor de un elemento del arreglo
        for (String animal : animales) {
            System.out.println("Animal: " + animal);
        }
    }
}