package creationDesignPatterns.abstractFactory.example1.pojo;

import creationDesignPatterns.abstractFactory.example1.interfaces.Flight;

public class AbroadFlight implements Flight {

    @Override
    public void print() {
        System.out.println("Im Abroad Flight");
    }
}
