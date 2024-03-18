abstract class Alumno {
    private String nombres;
    private String apellidos;
    private int creditosAprobados;

    public Alumno(String nombres, String apellidos, int creditosAprobados) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.creditosAprobados = creditosAprobados;
    }

    public abstract boolean yaEgreso();

    // Getters and setters
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCreditosAprobados() {
        return creditosAprobados;
    }

    public void setCreditosAprobados(int creditosAprobados) {
        this.creditosAprobados = creditosAprobados;
    }
}