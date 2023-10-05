package creation.abstractFactory.example1.pojo;

import creation.abstractFactory.example1.interfaces.Flight;

public class AbroadFlight implements Flight {

    @Override
    public void print() {
        System.out.println("Im Abroad Flight");
    }
}
