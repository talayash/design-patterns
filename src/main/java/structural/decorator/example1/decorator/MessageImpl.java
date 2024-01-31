package structural.decorator.example1.decorator;

import structural.decorator.example1.interfaces.Message;

public class MessageImpl implements Message {
    @Override
    public String printMessage() {
        return "Message";
    }
}
