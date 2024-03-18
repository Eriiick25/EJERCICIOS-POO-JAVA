import java.util.List;

public class Auto {
    private Long id;
    private String marca;
    private String modelo;
    private List<Propietario> listaPropietario;
   // private Propietario propietario;//RELACIÓN DE 1 A 1

    public Auto() {
    }

    /** //CONSTRUCTOR PARA 1 A 1
    public Auto(Long id, String marca, String modelo, Propietario propietario) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
    }
 */

    public Auto(Long id, String marca, String modelo, List<Propietario> listaPropietario) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.listaPropietario = listaPropietario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Propietario> getListaPropietario() {
        return listaPropietario;
    }

    public void setListaPropietario(List<Propietario> listaPropietario) {
        this.listaPropietario = listaPropietario;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", listaPropietario=" + listaPropietario +
                '}';
    }
}

