package creation.abstractFactory.example1.factories;

import creation.abstractFactory.example1.interfaces.Flight;
import creation.abstractFactory.example1.interfaces.Hotel;
import creation.abstractFactory.example1.pojo.DomesticFlight;
import creation.abstractFactory.example1.pojo.DomesticHotel;

public class DomesticFactory implements PackageFactory {
    @Override
    public Flight buildFlight() {
        return new DomesticFlight();
    }

    @Override
    public Hotel buildHotel() {
        return new DomesticHotel();
    }
}
