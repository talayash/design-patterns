package creationDesignPatterns.abstractFactory.example1.pojo;

import creationDesignPatterns.abstractFactory.example1.interfaces.Hotel;

public class DomesticHotel implements Hotel {

    @Override
    public void print() {
        System.out.println("Im Domestic Hotel");
    }
}
