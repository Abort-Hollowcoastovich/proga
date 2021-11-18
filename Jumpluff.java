import ru.ifmo.se.pokemon.Type;


class Jumpluff extends Skiploom {
    public Jumpluff(String name, int level){
        super( name, level);
        setStats( 75, 55, 70, 55, 95, 110);
        setType(Type.GRASS, Type.FLYING);
        addMove(new Thunder());
    }
}

