package Singleton;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {}

    public LazySingleton getInstance () {

        if (instance == null) {
            this.instance = new LazySingleton();
        }
        return instance;
    }
}
