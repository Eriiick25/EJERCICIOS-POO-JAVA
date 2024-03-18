import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /**
         1) CREAR UNA ARRAYLIST DE TIPO VIDEOJUEGO.
         CREAR 5 VIDEOJUEGOS Y GUARDARLOS EN LA COLLECTION
         */
        //Creando una arraylis
        List<Videojuego> videojuegosLista = new ArrayList<>();
        // Creando los 5 videojuegos
        Videojuego vid1 = new Videojuego(1, "Planta vs Zombie", "Xbox", 4,"batalla");
        Videojuego vid2 = new Videojuego(2, "Left4dead","PC",8,"Shooting");
        Videojuego vid3 = new Videojuego(3,"Sims","Nintendo64",10,"Familia");
        Videojuego vid4 = new Videojuego(4,"Brawstar","PC",15,"batalla");
        Videojuego vid5 = new Videojuego(5,"Roblox", "Nintendo64", 7,"Familia");
        // Agregando los videojuegos a la arraylist

        videojuegosLista.add(vid1);
        videojuegosLista.add(vid2);
        videojuegosLista.add(vid3);
        videojuegosLista.add(vid4);
        videojuegosLista.add(vid5);
        /**
         2) RECORRER LA ARRAYLIST CREADA Y MOSTRAR POR PANTALLA EL TITULO,
         CONSOLA Y CANTIDAD DE JUGADORES DE LOS VIDEOJUEGOS ALMACENADOS
         */
        for( Videojuego videojuego : videojuegosLista){
            System.out.println("==> Videojuego"+videojuego.getCodigo()+'\n'+
                    "Titulo: "+videojuego.getTitulo()+"\n"+
                    "Consola: "+videojuego.getConsola()+"\n"+
                    "Cantida de jugadores que posee: "+videojuego.getCantidadJugadores()+"\n");
        }
        /**
         3) CAMBIAR EL NOMBRE Y LA CANTIDAD DE JUGADORES DE DOS VIDEOJUEGOS.
         MOSTRAR POR LA PANTALLA LOS DATOS DE TODOS LOS VIDEOJUEGOS LUEGO DEL CAMBIO
         */
        //Se cambiará el videojuego 4
        vid4.setTitulo("Minecraft");
        vid4.setCantidadJugadores(100);
        System.out.println("---Realizando el cambio al videojuego 4---");
        System.out.println(vid4.toString());

        /**
         4) RECORRER LA ARRAYLIST Y MOSTRAR POR PANTALLA ÚNICAMENTE
         A LOS VIDEOJUEGOS QUE SEAN DE LA CONSOLA "Nintedo64"
         */
        System.out.println("---VIDEOJUEGOS DE LA CONSOLA Nintendo64");
        for (Videojuego x: videojuegosLista){
            if (x.getConsola() == "Nintendo64"){
                System.out.println(x.toString());
            }
        }


    }
}