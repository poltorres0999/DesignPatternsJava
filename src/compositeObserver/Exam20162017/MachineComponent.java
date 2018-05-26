package compositeObserver.Exam20162017;

public abstract class MachineComponent {

    private long id;

    public MachineComponent(long id) {
        this.id = id;
    }

    public long getId () {
        return this.id;
    }
}
