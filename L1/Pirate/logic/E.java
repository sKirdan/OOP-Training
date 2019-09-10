package L1.Pirate.logic;

import java.util.List;

public class Example<E> implements Line<E>{
    @Override
    public E next() {
        return null;
    }

    @Override
    public void joinToLine(E elem) {

    }

    @Override
    public void joinToLine(List<E> eList) {

    }

    @Override
    public void clearLine() {

    }
}
