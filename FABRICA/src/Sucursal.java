public class Sucursal extends Tienda{
    private String nombre;
    private boolean tieneAireAcondicionado;

    public Sucursal(String calle, String numeroPuerta, String numeroInterior, String distrito, int capacidadPersonas, boolean tieneAlmacen, String nombre, boolean tieneAireAcondicionado) {
        super(calle, numeroPuerta, numeroInterior, distrito, capacidadPersonas, tieneAlmacen);
        this.nombre = nombre;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

}
