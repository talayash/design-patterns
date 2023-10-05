package structural.bridge.example1.pojo;

import structural.bridge.example1.interfaces.Processor;

public class Laptop extends Computer{

    public Laptop(Processor processor) {
        super(processor);
    }

    @Override
    public void init() {
        System.out.print("Laptop with ");
        this.processor.cores();
    }
}
