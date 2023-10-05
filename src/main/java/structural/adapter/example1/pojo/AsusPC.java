package structural.adapter.example1.pojo;

import structural.adapter.example1.interfaces.Windows;

public class AsusPC implements Windows {
    @Override
    public void start() {
        System.out.println("Windows started for Asus PC!");
    }
}
