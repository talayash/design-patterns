package creation.abstractFactory.example1.factories;

import creation.abstractFactory.example1.interfaces.Flight;
import creation.abstractFactory.example1.interfaces.Hotel;
import creation.abstractFactory.example1.pojo.AbroadFlight;
import creation.abstractFactory.example1.pojo.AbroadHotel;

public class AbroadFactory implements PackageFactory {
    @Override
    public Flight buildFlight() {
        return new AbroadFlight();
    }

    @Override
    public Hotel buildHotel() {
        return new AbroadHotel();
    }
}
