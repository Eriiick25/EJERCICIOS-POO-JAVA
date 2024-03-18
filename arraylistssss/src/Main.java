import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Persona> lista= new ArrayList<Persona>();
        lista.add(new Persona(1,"Erick",20));
        lista.add(new Persona(2,"Mari",15));
        lista.add(new Persona(3,"Baguira",2));
        lista.add(new Persona(4,"Josesito",19));
        //Ahora, para recorrer e imprimir la lista:
        //utilizando for convencional
        System.out.println("-------------------------------------");
        for(int i=0; i< lista.size();i++){
            System.out.println("Prueba de: "+ lista.get(i).getNombre());
        }
        //utilizando el for each
        System.out.println("-------------------------------------");
        for (Persona perso:lista) {
            System.out.println("Prueba de: "+ perso.getNombre());
        }
    }
}