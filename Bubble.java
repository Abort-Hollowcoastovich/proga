import ru.ifmo.se.pokemon.*;


class Bubble extends SpecialMove {
    public Bubble() {super(Type.WATER, 40, 100);}
    protected String describe() {return "использует Bubble";}
    protected void applyOppEffects(Pokemon var1) {var1.setCondition(new Effect().chance(0.1).stat(Stat.SPEED, -1));}
}


