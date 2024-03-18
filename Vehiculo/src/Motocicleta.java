public class Motocicleta extends Vehiculo{

    private int cilindrada;
    private String tipoMotocicleta;

    public Motocicleta() {
    }

    public Motocicleta(int cilindrada, String tipoMotocicleta) {
        this.cilindrada = cilindrada;
        this.tipoMotocicleta = tipoMotocicleta;
    }

    @Override
    public double calcularCostoSeguro(){
        return 0;
    }
    public double calcularConsumoCombustible(){
        return 0;
    }
}
