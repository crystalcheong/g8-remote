package scse.g8.remote;

import java.util.Observable;

public class MySubject extends Observable {
    public void changeInstruction() {
        setChanged();
        notifyObservers();
    }
}
