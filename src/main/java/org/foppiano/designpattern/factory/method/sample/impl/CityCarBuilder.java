package org.foppiano.designpattern.factory.method.sample.impl;

import org.foppiano.designpattern.factory.method.sample.Car;
import org.foppiano.designpattern.factory.method.sample.CarBuilder;
import org.foppiano.designpattern.factory.method.sample.impl.car.CityCar;
import org.foppiano.designpattern.factory.method.sample.impl.car.TurboCar;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 07/01/14
 * Time: 08:13
 * To change this template use File | Settings | File Templates.
 */
public class CityCarBuilder extends CarBuilder {

    public Car createCar() {
        Car newCar = new CityCar();
        return newCar;
    }
}
