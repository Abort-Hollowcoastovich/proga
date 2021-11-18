import ru.ifmo.se.pokemon.*;


class Amnesia extends PhysicalMove {
    public Amnesia() {super(Type.PSYCHIC, 0, 0);}
    protected String describe() {return "использует Amnesia";}
    protected void applySelfEffects(Pokemon var1) {var1.setCondition(new Effect().stat(Stat.SPECIAL_DEFENSE, +2));}
}

