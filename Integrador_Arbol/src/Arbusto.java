public class Arbusto extends Planta {
    protected int anchoArbusto;
    protected boolean esDomestico;
    protected String variedadArbusto;
    protected String colorHojas;
    protected boolean sePodaONo;

    public Arbusto() {
    }

    public Arbusto(String nombre, int altoTallo, boolean tieneHojas, String climaIdeal, int anchoArbusto, boolean esDomestico, String variedadArbusto, String colorHojas, boolean sePodaONo) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.colorHojas = colorHojas;
        this.sePodaONo = sePodaONo;
    }
@Override
    public void mostrarPlanta(){
        System.out.println("hola soy un arbustooo");
    }
}
