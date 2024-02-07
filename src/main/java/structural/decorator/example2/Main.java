package structural.decorator.example2;

import structural.decorator.example2.cars.BasicCar;
import structural.decorator.example2.cars.LuxuryCar;
import structural.decorator.example2.cars.SportCar;
import structural.decorator.example2.interfaces.Car;

public class Main {
    public static void main(String[] args) {

        Car sportsCar = new SportCar(new BasicCar());
        sportsCar.assemble();

        Car sportsLuxuryCar = new SportCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();

    }
}
