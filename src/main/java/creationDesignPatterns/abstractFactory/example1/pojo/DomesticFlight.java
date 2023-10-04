package creationDesignPatterns.abstractFactory.example1.pojo;

import creationDesignPatterns.abstractFactory.example1.interfaces.Flight;

public class DomesticFlight implements Flight {

    @Override
    public void print() {
        System.out.println("Im Domestic Flight");
    }
}
