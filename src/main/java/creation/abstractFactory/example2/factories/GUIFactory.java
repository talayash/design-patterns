package creation.abstractFactory.example2.factories;

import creation.abstractFactory.example2.interfaces.Button;
import creation.abstractFactory.example2.interfaces.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
