package Composite.Problem_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public abstract class ComplexTask implements Task {

    protected Money cost;
    protected int duration;
    protected List<Task> taskList = new ArrayList<>();
    public boolean finalized = false;

    public ComplexTask(Money money, int duration) {
        this.cost = money;
        this.duration = duration;
    }

    public void addSubTask(Task task) {
        this.taskList.add(task);

    }


}
