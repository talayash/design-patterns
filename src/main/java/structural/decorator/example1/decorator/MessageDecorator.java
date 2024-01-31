package structural.decorator.example1.decorator;

import structural.decorator.example1.interfaces.Message;

public class MessageDecorator implements Message {

    // Attribute
    private final Message message;

    public MessageDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String printMessage() {
        return message.printMessage();
    }
}
