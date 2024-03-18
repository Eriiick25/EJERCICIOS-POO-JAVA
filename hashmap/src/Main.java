import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Map<Integer,String> hashmap = new HashMap<>();
        hashmap.put(1, "Erick");
        hashmap.put(2,"Iver");
        hashmap.put(3,"Pimentel");
        hashmap.put(4,"Daniel");
        boolean estaono = hashmap.containsKey(5);
        if(estaono==true){
            System.out.println("El key sí está en el mapa");
        }
        else{
            System.out.println("El key no está en el mapa");
        }
        System.out.println("Resultado: "+ hashmap.values());
        String nombre = hashmap.get(2);
        System.out.println("nombre: "+nombre);

    }
}