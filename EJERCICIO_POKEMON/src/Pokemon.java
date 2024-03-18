public abstract class Pokemon {
    protected int num_pokedex;
    protected String nombrePokemon;
    protected double pesoPokemon;
    protected String sexo;
    protected int temporadaQueAparece;

    public Pokemon() {
    }

    public Pokemon(int num_pokedex, String nombrePokemon, double pesoPokemon, String sexo, int temporadaQueAparece) {
        this.num_pokedex = num_pokedex;
        this.nombrePokemon = nombrePokemon;
        this.pesoPokemon = pesoPokemon;
        this.sexo = sexo;
        this.temporadaQueAparece = temporadaQueAparece;
    }
    public void atacarPlacaje(){

    };
    public void atacarArañazo(){};
    public void atacarMordisco(){};


}
