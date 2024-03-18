import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la categoría (1; 2; 3): 0");
        int n = scanner.nextInt() ;
        if (n==1){
            double sueldo= 1.10*15890;
            System.out.println("EL sueldo correspondiente al Repositor es:" +
                    sueldo+ "dolares.");
        }
        else{
            if ( n==2){
                double sueldo= 25630.89 ;
                System.out.println("El sueldo correspondiente al Cajero es "
                +sueldo+" dolares.");
            }else {
                if (n==3){
                    double sueldo= 0.89*35560.20;
                    System.out.println("El sueldo correspondiente al Supervisor es" +
                            + sueldo+ "dolares.");
                }
            }
        }


    }
}