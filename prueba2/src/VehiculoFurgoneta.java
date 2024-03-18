public class VehiculoFurgoneta extends Vehiculo{
    private int carga;

    public VehiculoFurgoneta(String matricula, String marca, String model, int carga) {
        super(matricula, marca, model);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+"\nCarga: "+carga;
    }
}
