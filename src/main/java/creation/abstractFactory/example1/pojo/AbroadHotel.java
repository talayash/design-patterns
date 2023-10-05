package creation.abstractFactory.example1.pojo;

import creation.abstractFactory.example1.interfaces.Hotel;

public class AbroadHotel implements Hotel {

    @Override
    public void print() {
        System.out.println("Im Abroad Hotel");
    }
}
