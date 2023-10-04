package creationDesignPatterns.abstractFactory.example1.factories;

import creationDesignPatterns.abstractFactory.example1.interfaces.Flight;
import creationDesignPatterns.abstractFactory.example1.interfaces.Hotel;
import creationDesignPatterns.abstractFactory.example1.pojo.DomesticFlight;
import creationDesignPatterns.abstractFactory.example1.pojo.DomesticHotel;

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
