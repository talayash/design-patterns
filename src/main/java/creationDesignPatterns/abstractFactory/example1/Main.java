package creationDesignPatterns.abstractFactory.example1;

import creationDesignPatterns.abstractFactory.example1.factories.AbroadFactory;
import creationDesignPatterns.abstractFactory.example1.factories.DomesticFactory;
import creationDesignPatterns.abstractFactory.example1.factories.PackageFactory;
import creationDesignPatterns.abstractFactory.example1.interfaces.Flight;
import creationDesignPatterns.abstractFactory.example1.interfaces.Hotel;

public class Main {
    public static void main(String[] args) {

        // Build Domestic products using package factory
        PackageFactory domesticFactory = new DomesticFactory();
        Flight domesticFlight = domesticFactory.buildFlight();
        Hotel domesticHotel = domesticFactory.buildHotel();

        // Build Abroad products using package factory
        PackageFactory abroadFactory = new AbroadFactory();
        Flight abroadFlight = abroadFactory.buildFlight();
        Hotel abroadHotel = abroadFactory.buildHotel();

        domesticFlight.print();
        domesticHotel.print();

        abroadFlight.print();
        abroadHotel.print();
    }
}
