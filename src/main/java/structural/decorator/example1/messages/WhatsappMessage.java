package structural.decorator.example1.messages;

import structural.decorator.example1.decorator.MessageDecorator;
import structural.decorator.example1.interfaces.Message;

public class WhatsappMessage extends MessageDecorator {

    public WhatsappMessage(Message message) {
        super(message);
    }

    public String printMessage() {
        return super.printMessage() + " " +  whatsappMessage();
    }

    public String whatsappMessage() {
        return "Type Whatsapp";
    }
}
