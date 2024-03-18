import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Declaración
        int vector[]= new int[4];
 /**
        //Asignación (manual)
        vector[0]=2;
        vector[1]= 35;
        vector[2]=48;
        vector[3]=157;
 **/
 // Asignación por teclado
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i< vector.length;i++){
            System.out.println("Ingrese el valor del indice: "+i);
            vector[i]= scanner.nextInt();
        }
        //Recorrido
        for(int i=0; i< vector.length; i++){
            System.out.println("Estoy en el indice "+i);
            System.out.println("Tengo guardado un "+vector[i]);
            System.out.println("---------------");
        }

    }
}