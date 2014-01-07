package org.foppiano.designpattern.factory.method.sample;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 07/01/14
 * Time: 08:11
 * To change this template use File | Settings | File Templates.
 */
public abstract class CarBuilder {

    /** The implementation is delegated to the subclasses **/
    protected abstract Car createCar();

    //Other methods
    public Car sendCar(String address) {
        Car car = createCar();
        System.out.println("Sending car to " + address);
        return car;
    }

}
