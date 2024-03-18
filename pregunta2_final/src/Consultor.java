public class Consultor extends Persona{
    String nombre_consultora;
    int num_consultora;

    public Consultor(int id_persona, String dni, String nombre, String apellido, String direccion, String telefono) {
        super(id_persona, dni, nombre, apellido, direccion, telefono);
    }

    public Consultor(int id_persona, String dni, String nombre, String apellido, String direccion, String telefono, String nombre_consultora, int num_consultora) {
        super(id_persona, dni, nombre, apellido, direccion, telefono);
        this.nombre_consultora = nombre_consultora;
        this.num_consultora = num_consultora;
    }

    public String getNombre_consultora() {
        return nombre_consultora;
    }

    public void setNombre_consultora(String nombre_consultora) {
        this.nombre_consultora = nombre_consultora;
    }

    public int getNum_consultora() {
        return num_consultora;
    }

    public void setNum_consultora(int num_consultora) {
        this.num_consultora = num_consultora;
    }
}