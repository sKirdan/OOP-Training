package L1.Pirate;

import L1.Pirate.logic.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bar bar = new Bar();
        Buhta buhta = new Buhta();

        Ship ship = buhta.getShip();
        Pirate cap = bar.gatCap();
        ArrayList<Pirate> pirates = bar.getPirates();

        ship.setCap(cap);
        ship.setPirates(pirates);

        ship.info();

        Act.Scena_1.go(ship);

        ship.info();

    }

    private void go(Ship ship) {
    }
}
