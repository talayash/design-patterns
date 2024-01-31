package structural.decorator.example1.messages;

import structural.decorator.example1.decorator.MessageDecorator;
import structural.decorator.example1.interfaces.Message;

public class SmsMessage extends MessageDecorator {

    // Constructor
    public SmsMessage(Message message) {
        super(message);
    }

    public String printMessage() {
        return super.printMessage() + " " +  smsMessage();
    }

    public String smsMessage() {
        return "Type SMS";
    }
}
