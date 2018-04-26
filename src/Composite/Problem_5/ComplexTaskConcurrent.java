package Composite.Problem_5;

public class ComplexTaskConcurrent extends ComplexTask {
    public ComplexTaskConcurrent(Money money, int duration) {
        super(money, duration);
    }

    @Override
    public Money costInEuros() {

        for (Task t: this.taskList) {
            this.cost.increase(t.costInEuros().getCurrency());
        }
        return this.cost;
    }

    @Override
    public int durationInDays() {

        int max = 0;
        for (Task t: this.taskList) {
            if (t.durationInDays() > max) max = t.durationInDays();
        }
        return max;
    }
}
