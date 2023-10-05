package structural.bridge.example1.pojo;

import structural.bridge.example1.interfaces.Processor;

public abstract class Computer {

    // Attributes
    private String companyName;
    protected Processor processor;

    // Constructor
    public Computer(Processor processor) {
        this.processor = processor;
    }

    // Initialize PC
    abstract public void init();
}
