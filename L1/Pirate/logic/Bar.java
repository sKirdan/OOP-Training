package L1.Pirate.logic;

import java.util.ArrayList;

public class Bar {
    public Pirate gatCap() {
        return new Pirate("Vasia", "cap");
    }

    public static void main(String[] args) {
        ArrayList<Pirate> pirates = new ArrayList<>(6);
        pirates.add(new Pirate("p1", "matros"));
        pirates.add(new Pirate("p2", "botsman"));
        pirates.add(new Pirate("p3", "matros"));
        pirates.add(new Pirate("p4", "younga"));
        pirates.add(new Pirate("p5", "shkiper"));
        pirates.add(new Pirate("p6", "baba na korable"));

        for (Object o : pirates) {
            System.out.println(o);

        }
    }

    public ArrayList<Pirate> getPirates() {
        return getPirates();
    }
}
