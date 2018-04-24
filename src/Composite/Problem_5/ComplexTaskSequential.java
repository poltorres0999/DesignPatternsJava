package Composite.Problem_5;

import java.util.ArrayList;
import java.util.List;

public class ComplexTaskSequential extends ComplexTask {

    private Money cost;
    private int duration;
    private List<Task> taskList = new ArrayList<>();

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

    public void addSubTask(Task task) {
        this.taskList.add(task);
    }
}
