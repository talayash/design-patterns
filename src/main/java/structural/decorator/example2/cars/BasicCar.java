package structural.decorator.example2.cars;

import structural.decorator.example2.interfaces.Car;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }
}
