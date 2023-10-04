package creationDesignPatterns.singleton.lazySingleton;

public class LazySingleton {

    // Constructor
    private LazySingleton() {

    }

    // Instance
    private static volatile LazySingleton INSTANCE;

    // Get Instance
    public static LazySingleton getInstance() {
        if(INSTANCE == null) {
            synchronized (LazySingleton.class) {
                if(INSTANCE == null) {
                        INSTANCE = new LazySingleton();
                }
            }
        }
        return INSTANCE;
    }
}
