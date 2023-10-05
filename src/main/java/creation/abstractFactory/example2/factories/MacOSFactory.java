package creation.abstractFactory.example2.factories;

import creation.abstractFactory.example2.interfaces.Button;
import creation.abstractFactory.example2.interfaces.Checkbox;
import creation.abstractFactory.example2.pojo.MacOSButton;
import creation.abstractFactory.example2.pojo.MacOSCheckbox;

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