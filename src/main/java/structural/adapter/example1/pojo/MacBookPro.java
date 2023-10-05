package structural.adapter.example1.pojo;

import structural.adapter.example1.interfaces.MacOS;

public class MacBookPro implements MacOS {
    @Override
    public void start() {
        System.out.println("MacOS started for Mac Book Pro!");
    }

    @Override
    public void connect() {
        System.out.println("< Mac Book Pro -- Connect to MacOS >");
    }
}
