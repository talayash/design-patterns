package creationDesignPatterns.objectPool.example1;

import creationDesignPatterns.objectPool.example1.objectPool.ObjectPool;
import creationDesignPatterns.objectPool.example1.pojo.Admin;
import creationDesignPatterns.objectPool.example1.pojo.Setting;

public class Main {

    public static final ObjectPool<Admin> adminPool = new ObjectPool<>(() -> new Admin("Tal"), 2);

    public static void main(String[] args) {

        Admin admin1 = adminPool.get();
        admin1.setSetting(new Setting("Admin1", 29));

        Admin admin2 = adminPool.get();
        admin2.setSetting(new Setting("Admin2", 30));

        admin1.print();
        admin2.print();

        adminPool.release(admin1);

        adminPool.release(admin2);
    }
}
