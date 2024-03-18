public class Tienda {
    private int capacidadPersonas;
    private boolean tieneAlmacen;

    public Tienda(String calle, String numeroPuerta, String numeroInterior, String distrito, int capacidadPersonas, boolean tieneAlmacen) {
        this.capacidadPersonas = capacidadPersonas;
        this.tieneAlmacen = tieneAlmacen;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }

    public boolean isTieneAlmacen() {
        return tieneAlmacen;
    }

    public void setTieneAlmacen(boolean tieneAlmacen) {
        this.tieneAlmacen = tieneAlmacen;
    }

}
