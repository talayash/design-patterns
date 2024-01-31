package structural.decorator.example1.messages;

import structural.decorator.example1.decorator.MessageDecorator;
import structural.decorator.example1.interfaces.Message;

public class MailMessage extends MessageDecorator {

    public MailMessage(Message message) {
        super(message);
    }

    public String printMessage() {
        return super.printMessage() + " " +  mailMessage();
    }

    public String mailMessage() {
        return "Type Mail";
    }
}
