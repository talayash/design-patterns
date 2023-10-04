package creationDesignPatterns.abstractFactory.example2.pojo;

import creationDesignPatterns.abstractFactory.example2.interfaces.Button;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a macOS button");
    }
}
