package compositeObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public abstract class ComplexTask extends Task implements Observer {

    protected Money cost;
    protected int duration;
    protected List<Task> taskList = new ArrayList<>();
    protected boolean finalized = false;
    protected List<Task> currentTasks = new ArrayList<Task>();

    public ComplexTask(Money money, int duration) {
        this.cost = money;
        this.duration = duration;
    }

    public void addSubTask(Task task) {
        this.taskList.add(task);
        task.addObserver(this);

        if (!task.hasFinalized()) {
            this.finalized = false;
            setChanged();
            notifyObservers();
        }

    }


}
