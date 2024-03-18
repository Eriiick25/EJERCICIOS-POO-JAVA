public class Circulo implements Figura,Rotable {
    private double radio;
    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        double pi=3.14;
        double result=pi*radio*radio;
        return result;
    }
    @Override
    public void rotar() {
        System.out.println("Hola, se puede rotar");
    }

}
