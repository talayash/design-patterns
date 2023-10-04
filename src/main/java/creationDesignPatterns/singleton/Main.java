package creationDesignPatterns.singleton;

import creationDesignPatterns.singleton.eagerSingleton.EagerSingleton;
import creationDesignPatterns.singleton.lazySingleton.LazySingleton;

public class Main {

    public static void main(String[] args) {

        // Eager Singleton
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton3 = EagerSingleton.getInstance();

        eagerSingleton1.addToSum(30);
        eagerSingleton3.addToSum(45);

        eagerSingleton2.getSum();

        // Lazy Singleton
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();

        System.out.println(lazySingleton1 == lazySingleton2);
        System.out.println(lazySingleton1.equals(lazySingleton2));

        // Holder Singleton

    }
}
