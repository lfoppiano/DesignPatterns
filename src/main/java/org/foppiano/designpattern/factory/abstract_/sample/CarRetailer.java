package org.foppiano.designpattern.factory.abstract_.sample;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 09/01/14
 * Time: 08:39
 * To change this template use File | Settings | File Templates.
 */
public class CarRetailer {

    CarFactory nyFactory;
    CarFactory londonFactory;

    public CarRetailer() {
        nyFactory = new NYCarFactory();
        londonFactory = new LondonCarFactory();
    }

    public Car orderCar(String name) {
        Car car = null;
        // Quick and Dirty
        if(name.equals("londra")) {
            car = new Car(londonFactory);
        } else {
            car = new Car(nyFactory);
        }

        car.assemblyCar();
        return car;
    }
}
