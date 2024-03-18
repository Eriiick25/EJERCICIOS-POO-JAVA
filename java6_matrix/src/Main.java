import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int matriz[][]=new int[3][3];
        Scanner numero = new Scanner(System.in);
        //Asignando los numeros
        for(int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                System.out.println("ingrese el numero de la posición: "+"["+i+"]"+"["+j+"]");
                matriz[i][j]= numero.nextInt();
            }

        }
        // Imprimiendo la matriz
        for(int i=0; i<3;i++){
            for( int j=0;j<3;j++){
                System.out.println(matriz[i][j]+ " ");

            }
            System.out.println();
        }

    }
}