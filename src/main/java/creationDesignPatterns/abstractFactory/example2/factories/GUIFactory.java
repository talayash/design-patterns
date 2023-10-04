package creationDesignPatterns.abstractFactory.example2.factories;

import creationDesignPatterns.abstractFactory.example2.interfaces.Button;
import creationDesignPatterns.abstractFactory.example2.interfaces.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
