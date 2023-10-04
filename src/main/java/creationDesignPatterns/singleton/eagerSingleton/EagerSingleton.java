package creationDesignPatterns.singleton.eagerSingleton;

public class EagerSingleton {

    // Attributes
    private int sum = 0;

    // Constructor
    private EagerSingleton() {}

    // Instance
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    // Get Instance
    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    // Methods
    public void addToSum(int number) {
        this.sum += number;
    }

    // Getters & Setters
    public void getSum() {
        System.out.println("Sum: " + sum);
    }
}
