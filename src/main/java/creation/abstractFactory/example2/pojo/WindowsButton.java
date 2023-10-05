package creation.abstractFactory.example2.pojo;

import creation.abstractFactory.example2.interfaces.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a Windows button");
    }
}
