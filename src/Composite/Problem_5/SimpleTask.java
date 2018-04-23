package Composite.Problem_5;

import java.math.BigDecimal;

public class SimpleTask implements Task {

    private Money cost;
    private int duration;

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
}
