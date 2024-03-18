import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Stack<Integer> pila= new Stack<>();
        System.out.println("Pila vacia: "+ pila);
        System.out.println("La pila está vacía?: "+ pila.isEmpty());
        // Agregando elementos:
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        //recorrido
        for( int pilita:pila){
            System.out.println(pilita);
        }
        //mostrar
        System.out.println("Pila vacia: "+ pila);
        System.out.println("La pila está vacía?: "+ pila.isEmpty());
         pila.pop(); //elimina el último elemento
        System.out.println("Está el numero 3?"+ pila.search(3));
        System.out.println("Último elemento agregado: "+ pila.peek());//el último elemento agragado pero que no fue eliminado




    }
}