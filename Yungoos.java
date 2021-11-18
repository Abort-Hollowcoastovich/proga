import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


class Yungoos extends Pokemon {
    public Yungoos(String name, int level){
        super( name, level);
        setStats( 48, 70, 30, 30, 30, 40);
        setType(Type.NORMAL);
        setMove(new DoubleTeam(), new Swagger(), new Facade());
    }
}

