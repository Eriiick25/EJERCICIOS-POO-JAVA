class AlumnoPregrado extends Alumno {
    private String facultad;

    public AlumnoPregrado(String nombres, String apellidos, int creditosAprobados, String facultad) {
        super(nombres, apellidos, creditosAprobados);
        this.facultad = facultad;
    }

    @Override
    public boolean yaEgreso() {
        return getCreditosAprobados() >= 200;
    }
}
