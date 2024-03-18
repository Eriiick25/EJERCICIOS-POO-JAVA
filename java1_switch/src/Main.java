// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int dia=5;
        String nombreDia;
        switch (dia){
            case 1: nombreDia="lunes";
            break;
            case 2: nombreDia="martes";
            break;
            case 3: nombreDia="miercoles";
            break;
            case 4: nombreDia="jueves";
            break;
            case 5: nombreDia="viernes";
            break;
            case 6: nombreDia="sabado";
            break;
            case 7: nombreDia="domingo";
            break;
            default: nombreDia="numero de dia invalido";
        };
        System.out.println("El dia de la semana seleccionado es "+
                switch (5));
    }
}