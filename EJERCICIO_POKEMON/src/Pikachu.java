public class Pikachu extends Pokemon implements IElectrico {
    public Pikachu() {
    }

    public Pikachu(int num_pokedex, String nombrePokemon, double pesoPokemon, String sexo, int temporadaQueAparece) {
        super(num_pokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece);
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Hola, soy Pikachuu y te estoy atacando con un placaje");
    }

    @Override
    public void atacarArañazo() {
        System.out.println("Hola, soy Pikachuu y te estoy atacando con un arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola, soy Pikachuu y te estoy atacando con un mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola, soy Pikachuu y te estoy atacando con un impactruenoooo");

    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola, soy Pikachuu y te estoy atacando con un puño de truenooo");

    }

    @Override
    public void atacarRayo() {
        System.out.println("Hola, soy Pikachuu y te estoy atacando con un rashooo");

    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Hola, soy Pikachuu y te estoy atacando con un rashoo de carga");

    }
}
