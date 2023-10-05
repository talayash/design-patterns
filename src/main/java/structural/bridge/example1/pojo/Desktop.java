package structural.bridge.example1.pojo;

import structural.bridge.example1.interfaces.Processor;

public class Desktop extends Computer{

    public Desktop(Processor processor) {
        super(processor);
    }

    @Override
    public void init() {
        System.out.print("Desktop with ");
        this.processor.cores();
    }
}
