package Composite.Problem_5;

public class SimpleTask implements Task {

    private double cost;
    private int duration;

    public SimpleTask (double cost, int duration) {
        this.cost = cost;
        this.duration = duration;
    }

    @Override
    public double costInEuros() {
        return this.cost;
    }

    @Override
    public int durationInDays() {
        return this.duration;
    }
}
