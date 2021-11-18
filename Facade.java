import ru.ifmo.se.pokemon.*;


class Facade extends PhysicalMove {
    public Facade() {super(Type.NORMAL, 70, 100);}
    protected String describe() {return "использует Facade";}
    protected void applyOppDamage(Pokemon var1, double var2) {
            Status ill  = var1.getCondition();
            if (ill == Status.BURN | ill == Status.POISON | ill == Status.PARALYZE){
                var2 *= 2;
            }
            var1.setMod(Stat.HP, (int)Math.round(var2));
        }
}


