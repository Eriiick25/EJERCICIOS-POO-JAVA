public class VehiculoDeportivo extends Vehiculo{
    private int cilindrada;

    public VehiculoDeportivo(String matricula, String marca, String model, int cilindrada) {
        super(matricula, marca, model);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+"\nCilindrada: "+cilindrada;
    }
}
