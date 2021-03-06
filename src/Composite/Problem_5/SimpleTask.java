package Composite.Problem_5;

import java.util.Observable;

public class SimpleTask implements Task {

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
        }
    }

    public boolean hasFinalized() {return this.finalized; }
}
