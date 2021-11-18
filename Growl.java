import ru.ifmo.se.pokemon.*;


class Growl extends StatusMove {
    public Growl() {super(Type.NORMAL, 0, 100);}
    protected String describe() {return "использует Growl";}
    protected void applyOppEffects(Pokemon var1) {var1.setCondition(new Effect().stat(Stat.ATTACK, -1));}
}


