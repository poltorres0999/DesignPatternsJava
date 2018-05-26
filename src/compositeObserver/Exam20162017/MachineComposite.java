package compositeObserver.Exam20162017;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class MachineComposite extends MachineComponent {

    private List<MachineComponent> components =  new ArrayList<>();
    private Observable observable = new Observable();
    private ConcreteObserver co = new ConcreteObserver(observable);

    public MachineComposite(long id) {
        super(id);
    }

    public void addComponent (MachineComponent mc) {

        if (!components.contains(mc)) {
            this.components.add(mc);

            /* observable.setChanged(); */
            observable.notifyObservers(this.getId());

            if (mc instanceof MachineComposite ) {
                ((MachineComposite) mc).getObservable().addObserver(co);
            }
        }
    }

    public Observable getObservable() {
        return this.observable;
    }


}
