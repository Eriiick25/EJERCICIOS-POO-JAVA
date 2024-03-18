class FabricaAutomoviles {
    private Sucursal[] sucursales;
    private int contadorSucursales;

    public FabricaAutomoviles() {
        sucursales = new Sucursal[10];
        contadorSucursales = 0;
    }

    public void agregarSucursal(Sucursal sucursal) {
        sucursales[contadorSucursales] = sucursal;
        contadorSucursales++;
    }

    public void removerSucursal(Sucursal sucursal) {
        for (int i = 0; i < contadorSucursales; i++) {
            if (sucursales[i].equals(sucursal)) {
                for (int j = i; j < contadorSucursales - 1; j++) {
                    sucursales[j] = sucursales[j + 1];
                }
                sucursales[contadorSucursales - 1] = null;
                contadorSucursales--;
                break;
            }
        }
    }

    public Sucursal[] obtenerSucursales() {
        Sucursal[] resultado = new Sucursal[contadorSucursales];
        for (int i = 0; i < contadorSucursales; i++) {
            resultado[i] = sucursales[i];
        }
        return resultado;
    }
}
