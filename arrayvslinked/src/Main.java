import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Persona> array1= new ArrayList<>();
        array1.add(new Persona(1,"Erick",19));
        array1.add(new Persona(2,"Daniel",20));
        array1.add(new Persona(3,"Josué",22));
        array1.add(new Persona(4,"Gabriel",17));
        LinkedList<Persona> linked = new LinkedList<>();
        linked.add(new Persona(1,"Erick",19));
        linked.add(new Persona(2,"Daniel",20));
        linked.add(new Persona(3,"Josué",22));
        linked.add(new Persona(4,"Gabriel",17));

        System.out.println("-----MOSTRANDO TODOS LOS NOMBRES----");

        for( Persona perso0: array1){
            System.out.println("=> "+ perso0.getNombre());
        }

        System.out.println("-----BORRANDO LOS ELEMENTOS------");

        // Removiendo en el arraylist
        array1.remove(1);
        // Removiendo en el linkedlist
        String nombreBorrar="Daniel";
        for(Persona persona2:linked){
            if (persona2.getNombre().equals(nombreBorrar)){
                linked.remove(persona2);
                break;// => para que deje de recorrer
            }

        }
        System.out.println("----LUEGO DE BORRAR EL ELEMENTOOO---");
        System.out.println("===> Arraylist: ");
        for(Persona perso1: array1){
            System.out.println("--> prueba "+ perso1.getNombre());
        };
        System.out.println("==> Linkedlist:");
        for( Persona perso2:linked){
            System.out.println("--> prueba "+ perso2.getNombre());
        }
        //ver el tamaño de la lista
        System.out.println("--¿ QUÉ TAMAÑO TIENEN LAS LISTAS?--");
        System.out.println("Arraylist: "+ array1.size());
        System.out.println("Linkedlist: "+ linked.size());

        //obtener el primer y el último elemento
        System.out.println("-- OBTENER EL PRIMER Y EL ÚLTIMO ELEMENTO --");
        System.out.println("primer elemento de Linkedlist: "+ linked.getFirst().toString());
        System.out.println("El último elemento de Linkedlist: "+ linked.getLast().toString());
        // Borrar lista
        System.out.println("---BORRANDO TODA LA LISTA---");
        array1.clear();
        linked.clear();
        //Verificando si la lista está vacía
        System.out.println("--¿Está vacía la lista?");
        System.out.println("Arralist:"+ array1.isEmpty());
        System.out.print("Linkedlist: "+ linked.isEmpty());
    }
}