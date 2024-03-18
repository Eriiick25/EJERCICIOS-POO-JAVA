// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try{
            int num=3/0;
        }
        catch (Exception e){
            System.out.println("NO SE PUEDE DIVIDIR ENTRE CERO CARAJO!!!!!!");
        }

            int edades[]={1,2,3,4};
        try {
        System.out.println("la edad de la posicion 4 es: "+edades[4]);
        }
        catch (Exception e){
            System.out.println("no existe esa posicion");
        }


    }
}