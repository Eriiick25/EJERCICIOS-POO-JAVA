public class Fabrica {
    private String Nombre;
    private int capacidad;

    public Fabrica(String calle, String numeroPuerta, String numeroInterior, String distrito, String nombre, int capacidad) {

        Nombre = nombre;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

}
