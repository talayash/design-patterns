package structural.bridge.example1.pojo;

import structural.bridge.example1.interfaces.Processor;

public class Intel implements Processor {

    // Attributes
    private String model;

    // Constructor
    public Intel(String model) {
        this.model = model;
    }

    @Override
    public void cores() {
        switch (model){
            case "i9" -> System.out.println(" 24 Cores");
            case "i7" -> System.out.println(" 16 Cores");
            case "i5" -> System.out.println(" 10 Cores");
            case "i3" -> System.out.println(" 6 Cores");
            default -> System.out.println("ERROR.");
        }
    }

    // Getters & Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
