import ru.ifmo.se.pokemon.*;


class MudBomb extends SpecialMove {
    public MudBomb() {super(Type.GROUND, 65, 85);}
    protected String describe() {return "использует Mud Bomb";}
    protected void applyOppEffects(Pokemon var1) {var1.setCondition(new Effect().chance(0.3).stat(Stat.ACCURACY, -1));}
}


