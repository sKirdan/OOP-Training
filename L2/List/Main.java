package L2.List;

import L1.Pirate.logic.Pirate;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pirate("sdf","df"));
        arrayList.add(new Pirate("sdf","df"));
        arrayList.add(new Pirate("ssdzfdf","df"));
        arrayList.add(new Pirate("sdf","df"));
        arrayList.add(new Pirate("sdsdfffff","df"));
        arrayList.add(new Pirate("sdf","df"));

        for (Object o : arrayList) {
            System.out.println(o);
        }
    }
}
