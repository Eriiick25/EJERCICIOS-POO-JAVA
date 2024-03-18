import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /**
         * REALIZAR UN PROGRAMA QUE PERMITA CARGAR 15 NÚMEROS EN UN VECTOR. UNA VEZ CARGADOS,
         * SE NECESITA QUE EL PROGRAMA CUENTE E INFORME POR PANTALLA CUANTAS VECES SE CARGÓ
         * EL NÚMERO 3
         */
        //Inicializando la matriz
        System.out.println("---------------------");
        System.out.println("CREANDO LA MATRIZ");
        int matriz[][]= new int[3][5];
        //Ingresando los 15 valores
        Scanner numero = new Scanner(System.in);
        for(int i=0; i<3 ;i++){
            for(int j=0;j<5;j++){
                System.out.println("Ingrese el valor de "+i+j+": ");
                matriz[i][j]= numero.nextInt();
            }
        }
        System.out.println("----------------------");
        //Realizando la condicion
        //Recorrido
        int cont=0;
        for(int i=0; i<3 ;i++){
            for(int j=0;j<5;j++){
                if(matriz[i][j]==3){
                    cont=cont+1;
                }
            }
        }
        System.out.println("El número de '3' encontrados en la matriz es: "+cont);



    }
}