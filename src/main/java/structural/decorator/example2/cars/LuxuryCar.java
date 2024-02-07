package structural.decorator.example2.cars;

import structural.decorator.example2.decorator.CarDecorator;
import structural.decorator.example2.interfaces.Car;

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print( "With Leather Seats and Huge Screen.\n");
    }
}
