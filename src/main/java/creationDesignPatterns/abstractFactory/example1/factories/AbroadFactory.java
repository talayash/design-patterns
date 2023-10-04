package creationDesignPatterns.abstractFactory.example1.factories;

import creationDesignPatterns.abstractFactory.example1.interfaces.Flight;
import creationDesignPatterns.abstractFactory.example1.interfaces.Hotel;
import creationDesignPatterns.abstractFactory.example1.pojo.AbroadFlight;
import creationDesignPatterns.abstractFactory.example1.pojo.AbroadHotel;

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
