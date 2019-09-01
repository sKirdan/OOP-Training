package L1.Pirate.logic;

public class Bar {
    public Pirate gatCap() {
        return new Pirate("capVasia");
    }

    public Pirate[] getPirates() {
        Pirate[] pirates = new Pirate[5];
        pirates[0] = new Pirate("p1");
        pirates[1] = new Pirate("p2");
        pirates[2] = new Pirate("p3");
        pirates[3] = new Pirate("p4");
        pirates[4] = new Pirate("p5");
        return pirates;

    }
}
