import ru.ifmo.se.pokemon.Type;


class Skiploom extends Hoppip {
    public Skiploom(String name, int level){
        super( name, level);
        setStats( 55, 45, 50, 45, 60, 80);
        setType(Type.GRASS, Type.FLYING);
        addMove(new Amnesia());
    }
}

