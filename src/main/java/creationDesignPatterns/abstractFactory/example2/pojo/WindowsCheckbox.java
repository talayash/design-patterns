package creationDesignPatterns.abstractFactory.example2.pojo;

import creationDesignPatterns.abstractFactory.example2.interfaces.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a Windows checkbox");
    }
}
