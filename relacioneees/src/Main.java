import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Auto auto= new Auto();
        auto.setId(123L);
        auto.setMarca("Artesco");
        auto.setModelo("AK47");
        List<Propietario> listaPropietarios = new ArrayList<>();
        Propietario prop1 = new Propietario(11L,"Jose","Rodriguez");
        Propietario prop2 = new Propietario(22L, "Erick","Pimentel");
        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);
        auto.setListaPropietario(listaPropietarios);
        //mostrando la información
        System.out.println("El auto"+ auto.getId()+ " " +
                "de la marca "+ auto.getMarca()+ " y el modelo "+
                auto.getModelo()+ "tiene como propietarios a "+ auto.getListaPropietario().toString());
    }
}