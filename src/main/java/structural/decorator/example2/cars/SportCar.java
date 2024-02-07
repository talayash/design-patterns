package structural.decorator.example2.cars;

import structural.decorator.example2.decorator.CarDecorator;
import structural.decorator.example2.interfaces.Car;

public class SportCar extends CarDecorator {

    public SportCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" With Turbo and Sport Tires.\n");
    }
}
