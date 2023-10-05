package creation.abstractFactory.example1.pojo;

import creation.abstractFactory.example1.interfaces.Hotel;

public class DomesticHotel implements Hotel {

    @Override
    public void print() {
        System.out.println("Im Domestic Hotel");
    }
}
