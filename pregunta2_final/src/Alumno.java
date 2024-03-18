public class Alumno {
    int Id;
    String nombre;
    String apellido;

    public Alumno() {
    };
    public Alumno(int id, String nombre, String apellido) {
        Id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void mostraNombre(){
        System.out.println("Hola, spu un alumno " +
                "y se decir mi nombre");

    };

    }
