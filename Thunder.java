import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;


class Thunder extends SpecialMove {
    public Thunder() {super(Type.ELECTRIC, 110, 70);}
    protected String describe() {return "использует Thunder";}
    protected void applyOppEffects(Pokemon var1) {
        if (Math.random() < 0.3){ Effect.paralyze(var1);}
    }
}

