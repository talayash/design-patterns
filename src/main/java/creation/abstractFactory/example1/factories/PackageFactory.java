package creation.abstractFactory.example1.factories;

import creation.abstractFactory.example1.interfaces.Flight;
import creation.abstractFactory.example1.interfaces.Hotel;

public interface PackageFactory {
    Flight buildFlight();
    Hotel buildHotel();
}
