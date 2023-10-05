package structural.adapter.example2.pojo;

import structural.adapter.example2.interfaces.Bluetooth;

public class Logitech extends Headphones implements Bluetooth {

    // Attributes
    private String subType;

    // Constructor
    public Logitech(String name, String subType) {
        super(name);
        this.subType = subType;
    }

    // Implementation methods
    @Override
    public void connect() {
        System.out.println("Logitech " + getName() + " " +  subType + " connected to Bluetooth.");
    }

    @Override
    public void disconnect() {
        System.out.println("Logitech " + getName() + " " +  subType + " disconnected from Bluetooth.");
    }

    // Getters & Setters
    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }
}
