import java.util.LinkedList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Persona> lista = new LinkedList<>();
        // Agregar las personas al final de la lista
        lista.add(new Persona(1,"Erick",30));
        lista.add(new Persona(2,"josé",28));
        lista.add(new Persona(3,"Daniel",19));
        lista.add(new Persona(4,"Gustavo",17));
        lista.add(new Persona(5,"Sofia",20));
        // Agregar al principio de la lista
        lista.add(0,new Persona(6,"Probando",48));

        System.out.println("-------FOREACH-------");
        for (Persona person:lista
             ) {
            System.out.println("prueba "+ person.getNombre());
        }


    }
}