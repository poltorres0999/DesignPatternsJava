package compositeObserver.Exam20162017;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {

    Observable observable;

    public ConcreteObserver(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update(Observable o, Object arg) {

        System.out.println(Long.toString((long)arg));
        /* observable.setChanged(); Es privat pero la solució ho simplifica a protected(enunciat) */
        observable.notifyObservers(Long.toString((long)arg));

    }

}
