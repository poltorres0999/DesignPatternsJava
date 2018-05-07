package compositeObserver;

import java.util.Observable;

public abstract class Task extends Observable {
    public abstract Money costInEuros();
    public abstract int durationInDays();
    public abstract boolean hasFinalized();
}
