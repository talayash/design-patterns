package creationDesignPatterns.abstractFactory.example2.factories;

import creationDesignPatterns.abstractFactory.example2.interfaces.Button;
import creationDesignPatterns.abstractFactory.example2.interfaces.Checkbox;
import creationDesignPatterns.abstractFactory.example2.pojo.MacOSButton;
import creationDesignPatterns.abstractFactory.example2.pojo.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}