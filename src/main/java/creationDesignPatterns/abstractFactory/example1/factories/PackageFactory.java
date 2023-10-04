package creationDesignPatterns.abstractFactory.example1.factories;

import creationDesignPatterns.abstractFactory.example1.interfaces.Flight;
import creationDesignPatterns.abstractFactory.example1.interfaces.Hotel;

public interface PackageFactory {
    Flight buildFlight();
    Hotel buildHotel();
}
