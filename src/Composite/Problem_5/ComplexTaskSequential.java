package Composite.Problem_5;

import java.util.ArrayList;
import java.util.List;

public class ComplexTaskSequential extends ComplexTask {

    public ComplexTaskSequential(Money money, int duration) {
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
        for (Task t: this.taskList) {
            this.duration += t.durationInDays();
        }

        return this.duration;
    }

}
