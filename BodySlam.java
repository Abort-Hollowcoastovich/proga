import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


class BodySlam extends PhysicalMove {
    public BodySlam() {super(Type.NORMAL, 85, 100);}
    protected String describe() {return "использует Body Slam";}
    protected void applyOppEffects(Pokemon var1) {
        if (Math.random() < 0.3){ Effect.paralyze(var1);}
    }
}


