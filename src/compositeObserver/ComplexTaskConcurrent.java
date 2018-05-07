package compositeObserver;

import java.util.Observable;

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

    @Override
    public boolean hasFinalized() {
        return false;
    }

    @Override
    public void update(Observable o, Object arg) {

        Task t = (Task) o;
        if (t.hasFinalized() && t.durationInDays() == this.durationInDays()) {
            this.currentTasks.clear();
            this.finalized = true;
            setChanged();
            notifyObservers();

        } else {
            this.currentTasks.remove(t);
            if (currentTasks.isEmpty()) {
                this.finalized = true;
                setChanged();
                notifyObservers();
            }
        }

    }
}
