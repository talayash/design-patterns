package creation.singleton.holderSingleton;

public class HolderSingleton {

    // Constructor
    private HolderSingleton() {
        System.out.println("Holder Singleton Created!");
    }

    // Holder class
    private static class Holder {
        static HolderSingleton INSTANCE = new HolderSingleton();
    }

    // Get instance
    public static HolderSingleton getInstance() {
        return Holder.INSTANCE;
    }
}
