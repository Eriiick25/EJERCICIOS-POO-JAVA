public class Flor extends Planta {
    protected String colorDePetalos;
    protected int cantPromDePetalos;
    protected String colorDelPistilo;
    protected String colorDeLosPetalos;
    protected String variedadDeFlor;
    protected String estacionFlorece;

    public Flor() {
    }

    public Flor(String nombre, int altoTallo, boolean tieneHojas, String climaIdeal, String colorDePetalos, int cantPromDePetalos, String colorDelPistilo, String colorDeLosPetalos, String variedadDeFlor, String estacionFlorece) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorDePetalos = colorDePetalos;
        this.cantPromDePetalos = cantPromDePetalos;
        this.colorDelPistilo = colorDelPistilo;
        this.colorDeLosPetalos = colorDeLosPetalos;
        this.variedadDeFlor = variedadDeFlor;
        this.estacionFlorece = estacionFlorece;
    }

    public String getColorDePetalos() {
        return colorDePetalos;
    }

    public void setColorDePetalos(String colorDePetalos) {
        this.colorDePetalos = colorDePetalos;
    }

    public int getCantPromDePetalos() {
        return cantPromDePetalos;
    }

    public void setCantPromDePetalos(int cantPromDePetalos) {
        this.cantPromDePetalos = cantPromDePetalos;
    }

    public String getColorDelPistilo() {
        return colorDelPistilo;
    }

    public void setColorDelPistilo(String colorDelPistilo) {
        this.colorDelPistilo = colorDelPistilo;
    }

    public String getColorDeLosPetalos() {
        return colorDeLosPetalos;
    }

    public void setColorDeLosPetalos(String colorDeLosPetalos) {
        this.colorDeLosPetalos = colorDeLosPetalos;
    }

    public String getVariedadDeFlor() {
        return variedadDeFlor;
    }

    public void setVariedadDeFlor(String variedadDeFlor) {
        this.variedadDeFlor = variedadDeFlor;
    }

    public String getEstacionFlorece() {
        return estacionFlorece;
    }

    public void setEstacionFlorece(String estacionFlorece) {
        this.estacionFlorece = estacionFlorece;
    }
    @Override
    public void mostrarPlanta() {
        System.out.println("Hola,soy una flor");

    }
}
