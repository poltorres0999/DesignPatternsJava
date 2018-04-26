package Composite.Problem_5;

import java.util.ArrayList;
import java.util.List;

public abstract class ComplexTask implements Task {

    protected Money cost;
    protected int duration;
    protected List<Task> taskList = new ArrayList<>();

    public ComplexTask(Money money, int duration) {
        this.cost = money;
        this.duration = duration;
    }

    public void addSubTask(Task task) {
        this.taskList.add(task);
    }
}
