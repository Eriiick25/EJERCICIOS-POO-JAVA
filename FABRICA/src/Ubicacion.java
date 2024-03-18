public class Ubicacion {
    private String calle;
    private String numeroPuerta;
    private String numeroInterior;
    private String distrito;
    //

    public Ubicacion(String calle, String numeroPuerta, String numeroInterior, String distrito) {
        this.calle = calle;
        this.numeroPuerta = numeroPuerta;
        this.numeroInterior = numeroInterior;
        this.distrito = distrito;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumeroPuerta() {
        return numeroPuerta;
    }

    public void setNumeroPuerta(String numeroPuerta) {
        this.numeroPuerta = numeroPuerta;
    }

    public String getNumeroInterior() {
        return numeroInterior;
    }

    public void setNumeroInterior(String numeroInterior) {
        this.numeroInterior = numeroInterior;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    public String getDireccion(){
        return distrito+" "+calle+" "+numeroPuerta+" "+numeroInterior;
    }
}
