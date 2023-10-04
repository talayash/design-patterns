package creationDesignPatterns.abstractFactory.example2.factories;

import creationDesignPatterns.abstractFactory.example2.interfaces.Button;
import creationDesignPatterns.abstractFactory.example2.interfaces.Checkbox;
import creationDesignPatterns.abstractFactory.example2.pojo.WindowsButton;
import creationDesignPatterns.abstractFactory.example2.pojo.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
