class AlumnoMaestria extends Alumno {
    private String especialidad;

    public AlumnoMaestria(String nombres, String apellidos, int creditosAprobados, String especialidad) {
        super(nombres, apellidos, creditosAprobados);
        this.especialidad = especialidad;
    }

    @Override
    public boolean yaEgreso() {
        return getCreditosAprobados() >= 60;
    }
}