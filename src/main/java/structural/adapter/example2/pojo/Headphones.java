package structural.adapter.example2.pojo;

public abstract class Headphones {

    // Attributes
    private String name;

    // Constructor
    public Headphones(String name) {
        this.name = name;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
