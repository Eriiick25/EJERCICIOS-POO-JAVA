public class Cuadrado implements Figura, Dibujable {

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double result=lado*lado;
        return result;
    }
    @Override
    public void dibujar(){
        System.out.println("Hola, se puede dibujar");
    };
}
