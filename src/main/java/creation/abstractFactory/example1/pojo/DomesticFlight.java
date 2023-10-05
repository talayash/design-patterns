package creation.abstractFactory.example1.pojo;

import creation.abstractFactory.example1.interfaces.Flight;

public class DomesticFlight implements Flight {

    @Override
    public void print() {
        System.out.println("Im Domestic Flight");
    }
}
