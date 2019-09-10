package L1.Pirate.logic;

import java.util.List;

public interface Line<E> {
    E next();
    void joinToLine(E elem);
    void joinToLine(List<E> eList);
    void clearLine();
}
