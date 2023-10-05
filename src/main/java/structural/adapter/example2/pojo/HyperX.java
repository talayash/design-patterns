package structural.adapter.example2.pojo;

import structural.adapter.example2.interfaces.WiFI;

public class HyperX extends Headphones implements WiFI {

    // Attributes
    private int generation;

    // Constructor
    public HyperX(String name, int generation) {
        super(name);
        this.generation = generation;
    }

    // Implementation methods
    @Override
    public void connect() {
        System.out.println("HyperX Gen-" + generation + " " + getName() +  " connected to WiFi.");
    }

    @Override
    public void disconnect() {
        System.out.println("HyperX Gen-" + generation + " " + getName() +  " disconnected to WiFi.");
    }

    // Getters & Setters
    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }
}
