package structural.bridge.example1;

import structural.bridge.example1.pojo.*;

public class Main {

    public static void main(String[] args) {

        Computer desktopAMD = new Desktop(new AMD("ryzen5"));
        desktopAMD.init();

        Computer desktopIntel = new Desktop(new Intel("i5"));
        desktopIntel.init();

        Computer laptopAMD = new Laptop(new AMD("ryzen7"));
        laptopAMD.init();

        Computer laptopIntel = new Laptop(new Intel("i9"));
        laptopIntel.init();

    }
}
