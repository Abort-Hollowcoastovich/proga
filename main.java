import ru.ifmo.se.pokemon.*;

public class main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Kangaskhan("Максим Кач", 1);
        Pokemon p2 = new Yungoos("Алексей Провальный", 1);
        Pokemon p3 = new Gumshoos("Джо Мама", 1);
        Pokemon p4 = new Hoppip("Баю Байден", 1);
        Pokemon p5 = new Skiploom("Ким Саныч", 1);
        Pokemon p6 = new Jumpluff("Татар Евреев", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}