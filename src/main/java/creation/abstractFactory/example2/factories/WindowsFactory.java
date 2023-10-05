package creation.abstractFactory.example2.factories;

import creation.abstractFactory.example2.interfaces.Button;
import creation.abstractFactory.example2.interfaces.Checkbox;
import creation.abstractFactory.example2.pojo.WindowsButton;
import creation.abstractFactory.example2.pojo.WindowsCheckbox;

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
