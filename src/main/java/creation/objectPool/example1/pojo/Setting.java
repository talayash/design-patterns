package creation.objectPool.example1.pojo;

public class Setting {

    // Attributes
    private String name;
    private int age;

    // Constructor
    public Setting(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString
    @Override
    public String toString() {
        return "Setting{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
