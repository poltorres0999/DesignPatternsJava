package composite.Problem_5;

import java.util.ArrayList;
import java.util.List;

public class ComplexTask implements Task {

    private double cost;
    private int duration;
    private List<Task> taskList = new ArrayList<>();

    @Override
    public double costInEuros() {

        for (Task t: this.taskList) {
            this.cost += t.costInEuros();
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
