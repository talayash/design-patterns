package structural.adapter.example1;

import structural.adapter.example1.adapter.MacOsAdapter;
import structural.adapter.example1.interfaces.MacOS;
import structural.adapter.example1.interfaces.Windows;
import structural.adapter.example1.pojo.AsusPC;
import structural.adapter.example1.pojo.MacBookPro;

public class Main {

    public static void main(String[] args) {

        Windows asusPC = new AsusPC();
        MacOS asusPCWithMacOS = new MacOsAdapter(asusPC);
        asusPCWithMacOS.connect();
        asusPCWithMacOS.start();

        MacOS macBookPro = new MacBookPro();
        macBookPro.start();
        macBookPro.connect();
    }
}
