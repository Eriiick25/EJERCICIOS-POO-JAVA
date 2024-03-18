public class VehiculoTurismo extends Vehiculo{
    private int nroPuertas;
    public VehiculoTurismo(String matricula, String marca, String model, int nroPuertas) {
        super(matricula, marca, model);
        this.nroPuertas = nroPuertas;
    }

    public int getNroPuertas() {
        return nroPuertas;
    }

    public void setNroPuertas(int nroPuertas) {
        this.nroPuertas = nroPuertas;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+"/Nro de puertas: "+nroPuertas;
    }
}
