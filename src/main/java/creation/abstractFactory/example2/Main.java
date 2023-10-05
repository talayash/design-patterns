package creation.abstractFactory.example2;

import creation.abstractFactory.example2.factories.GUIFactory;
import creation.abstractFactory.example2.factories.MacOSFactory;
import creation.abstractFactory.example2.factories.WindowsFactory;
import creation.abstractFactory.example2.interfaces.Button;
import creation.abstractFactory.example2.interfaces.Checkbox;

public class Main {
    public static void main(String[] args) {
        // Create a Windows GUI
        GUIFactory windowsFactory = new WindowsFactory();
        Button windowsButton = windowsFactory.createButton();
        Checkbox windowsCheckbox = windowsFactory.createCheckbox();

        // Create a macOS GUI
        GUIFactory macosFactory = new MacOSFactory();
        Button macosButton = macosFactory.createButton();
        Checkbox macosCheckbox = macosFactory.createCheckbox();

        // Use the created GUI components
        windowsButton.paint();
        windowsCheckbox.paint();

        macosButton.paint();
        macosCheckbox.paint();
    }
}
