package org.foppiano.designpattern.factory.method.sample.impl.car;

import org.foppiano.designpattern.factory.method.sample.Car;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 07/01/14
 * Time: 08:13
 * To change this template use File | Settings | File Templates.
 */
public class CityCar implements Car{

    @Override
    public void start() {
        System.out.println ("Starting the car.");
    }

    @Override
    public void stop() {
        System.out.println("Turning off the car.");
    }

    @Override
    public void breaking() {
        System.out.println("Breaking!");
    }

    @Override
    public void accel() {
        System.out.println("mmmmmmmmmm");
    }
}
