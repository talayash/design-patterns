package structural.adapter.example1.adapter;

import structural.adapter.example1.interfaces.MacOS;
import structural.adapter.example1.interfaces.Windows;

public class MacOsAdapter implements MacOS {

    // Attributes
    private Windows asusPC;

    // Constructor
    public MacOsAdapter(Windows asusPC) {
        this.asusPC = asusPC;
    }

    // Getters & Setters
    public Windows getAsusPC() {
        return asusPC;
    }

    public void setAsusPC(Windows asusPC) {
        this.asusPC = asusPC;
    }

    @Override
    public void start() {
        System.out.println("MacOS started for Asus PC!");
    }

    @Override
    public void connect() {
        System.out.println("< Asus PC -- Connect to MacOS >");
    }
}
