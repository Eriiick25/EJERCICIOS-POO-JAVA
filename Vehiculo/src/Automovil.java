public class Automovil extends Vehiculo{
    private int numeroPuertas;
    private String tipoCombustible;

    public Automovil() {
    };

    public Automovil(int numeroPuertas, String tipoCombustible) {
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public double calcularCostoSeguro(){
        return 0;
    };
    public double calcularConsumoCombustible(){
        return 0;
    }
}
