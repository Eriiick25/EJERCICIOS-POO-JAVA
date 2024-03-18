public class Vehiculo {
    protected String matricula;
    protected String marca;
    protected String model;

    public Vehiculo(String matricula, String marca, String model) {
        this.matricula = matricula;
        this.marca = marca;
        this.model = model;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String mostrarDatos(){
        return "matrícula: "+matricula+"\nMarca: "+marca+
                "\nModelo: "+model;
    }
}