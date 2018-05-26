package compositeObserver.Problem7;

public class SimpleTask extends Task {

    private Money cost;
    private int duration;
    private boolean finalized = false;

    public SimpleTask (Money cost, int duration) {
        this.cost = cost;
        this.duration = duration;
    }

    @Override
    public Money costInEuros() {
        return this.cost;
    }

    @Override
    public int durationInDays() {
        return this.duration;
    }

    public void finalize () {
        if (!finalized) {
            this.finalized = true;
            setChanged();
            notifyObservers();
        }
    }

    public boolean hasFinalized() {return this.finalized; }
}
