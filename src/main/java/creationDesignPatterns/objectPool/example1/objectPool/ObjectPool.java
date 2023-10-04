package creationDesignPatterns.objectPool.example1.objectPool;

import creationDesignPatterns.objectPool.example1.interfaces.PoolAble;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool<T extends PoolAble> {

    // Attributes
    private final BlockingQueue<T> availablePool;

    // Constructor
    public ObjectPool(Supplier<T> creator, int count) {
        availablePool = new LinkedBlockingQueue<>();
        for(int i=0; i< count;i++) {
            availablePool.offer(creator.get());
        }
    }

    // Get method
    public T get() {
        try {
            return availablePool.take();
        }
        catch(InterruptedException ex) {
            System.err.println("take() was interrupted");
        }
        return null;
    }

    // Release Method
    public void release(T obj) {
        obj.reset();
        try {
            availablePool.put(obj);
        }
        catch (InterruptedException e) {
            System.err.println("put() was interrupted");
        }
    }
}
