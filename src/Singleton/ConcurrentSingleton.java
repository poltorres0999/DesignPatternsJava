package Singleton;

public class ConcurrentSingleton {

    private static ConcurrentSingleton instance;

    private ConcurrentSingleton () {}

    public ConcurrentSingleton getInstance () {
        synchronized (ConcurrentSingleton.class) {
            if (instance == null) {
                instance = new ConcurrentSingleton();
            }
            return instance;
        }
    }
}
