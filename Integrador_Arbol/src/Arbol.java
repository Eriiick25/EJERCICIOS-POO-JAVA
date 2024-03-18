public class Arbol extends Planta{
    protected String variedad;
    protected String tipoTronco;
    protected String color;
    protected String tipoHojas;

    public Arbol() {
    }

    public Arbol(String nombre, int altoTallo, boolean tieneHojas, String climaIdeal, String variedad, String tipoTronco, String color, String tipoHojas) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.color = color;
        this.tipoHojas = tipoHojas;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoTronco() {
        return tipoTronco;
    }

    public void setTipoTronco(String tipoTronco) {
        this.tipoTronco = tipoTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoHojas() {
        return tipoHojas;
    }

    public void setTipoHojas(String tipoHojas) {
        this.tipoHojas = tipoHojas;
    }
    @Override
    public void mostrarPlanta(){
        System.out.println("hola, soy un arbol");
    }
}
