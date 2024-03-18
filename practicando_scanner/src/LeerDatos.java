import java.util.Scanner;

public class LeerDatos {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("INGRESE SU NOMBRE: ");
        String nombre= scanner.nextLine();
       int edad= scanner.nextInt();
        System.out.println(nombre+" en 10 años tendrá "+ (edad+10)+" años");
    }
}
