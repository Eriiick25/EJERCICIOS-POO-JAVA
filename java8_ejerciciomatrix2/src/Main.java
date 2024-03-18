import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /**
         * En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos
         * de secundaria. Cada fila corresponde a las notas y al promedio de cada
         * alumno. Se necesite un programa que permita un profesor cargar, en las
         * 3 posiciones ( columnas) de cada fila, las notas del alumno y que en
         * la última columna se calculen los promedios. Una vez realizados los calculos,
         * se desea mostrar las 3 notas de cada alumno y el primedio
         * correspondiente recorriendo la matriz
         */
        //Inicializando la matriz
        double matriz[][] = new double[4][4];
        //Cargar las notas del alumno
        System.out.println("----INGRESAR LAS NOTAS----");
        Scanner numero= new Scanner(System.in);

        for( int i=0; i<4;i++){
            double suma=0;
            for( int j=0;j<4;j++){
                if(j<3){
                System.out.println("INGRESAR LA NOTA "+j+" del alumno "+ i+"==>");
                matriz[i][j]= numero.nextDouble();
                suma=suma+matriz[i][j];}
                else{
                    matriz[i][j]=suma/3;
                }


            }
        }
        //Imprimiendo las notas
        System.out.println("------RESULTADOS DE LAS NOTAS------");
        for(int i=0; i< 4; i++){
            System.out.println("==> Notas del alumno "+i);
            for( int j=0;j<4;j++){
                if(j<3) {
                    System.out.println("Nota del examen " + j + "->" + matriz[i][j]);
                }else {
                    System.out.println("Promedio de sus examenes: "+ matriz[i][j]);
                }

            }
            System.out.println();
        }
    }
}