package compositeObserver.Problem7;

import java.util.Observable;

public class ComplexTaskSequential extends ComplexTask {

    public ComplexTaskSequential(Money money, int duration) {
        super(money, duration);
    }


    @Override
    public void addSubTask(Task task) {

        boolean wasFinalized = this.hasFinalized();
        this.taskList.add(task);
        task.addObserver(this);

        if (wasFinalized && !task.hasFinalized()) {
            this.finalized = false;
            currentTasks.add(task);
            setChanged();
            notifyObservers();
        }

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

    @Override
    public void update(Observable o, Object arg) {

        Task t = (Task) o;
        if (t.hasFinalized()) {
            this.currentTasks.remove(t);
            if (currentTasks.isEmpty()) {
                this.finalized = true;
                setChanged();
                notifyObservers();
            }
        }
    }
}
