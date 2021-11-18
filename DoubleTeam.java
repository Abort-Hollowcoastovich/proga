import ru.ifmo.se.pokemon.*;


class DoubleTeam extends StatusMove{
    public DoubleTeam() {super(Type.NORMAL, 0, 0);}
    protected String describe() {return "использует Double Team";}
    protected void applySelfEffect(Pokemon var1) {var1.setCondition(new Effect().stat(Stat.EVASION, +1));}
}


