package structural.bridge.example1.pojo;

import structural.bridge.example1.interfaces.Processor;

public class AMD implements Processor {

    private String model;

    public AMD(String model) {
        this.model = model;
    }

    @Override
    public void cores() {
        switch (model){
            case "ryzen9" -> System.out.println(" 24 Cores");
            case "ryzen7" -> System.out.println(" 16 Cores");
            case "ryzen5" -> System.out.println(" 10 Cores");
            default -> System.out.println("ERROR.");
        }
    }
}
