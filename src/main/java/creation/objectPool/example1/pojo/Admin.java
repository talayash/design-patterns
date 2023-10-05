package creation.objectPool.example1.pojo;

import creation.objectPool.example1.interfaces.User;

public class Admin implements User {

    // Attributes
    private Setting setting;
    private String name;

    // Constructor
    public Admin(String name) {
        this.name = name;
    }

    @Override
    public void reset() {
        setting = null;
        System.out.println("Admin is reset!");
    }

    @Override
    public void print() {
        System.out.println("Print " + name + " with Settings: " + setting);
    }

    @Override
    public void setSetting(Setting setting) {
        this.setting = setting;
    }

    @Override
    public Setting getSetting() {
        return setting;
    }
}
