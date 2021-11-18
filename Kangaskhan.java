import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


class Kangaskhan extends Pokemon {
    public Kangaskhan(String name, int level){
        super( name, level);
        setStats( 105, 95, 80, 40, 80, 90);
        setType(Type.NORMAL);
        setMove(new Bubble(), new MudBomb(), new BodySlam(), new Bulldoze());
    }
}

