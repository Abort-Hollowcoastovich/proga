import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


class Hoppip extends Pokemon {
    public Hoppip(String name, int level){
        super( name, level);
        setStats( 35, 35, 40, 35, 55, 50);
        setType(Type.GRASS, Type.FLYING);
        setMove(new Confide(), new Swagger());
    }
}

