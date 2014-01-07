package org.foppiano.designpattern.factory.method.sample.impl;

import org.foppiano.designpattern.factory.method.sample.Car;
import org.foppiano.designpattern.factory.method.sample.CarBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 07/01/14
 * Time: 08:25
 * To change this template use File | Settings | File Templates.
 */
public class CityCarBuilderTest {

    @Test
    public void testOperationMethod() throws Exception {
        CarBuilder target  = new CityCarBuilder();

        Car result = target.sendCar("Aruba");

        result.start();
        result.breaking();
        result.accel();

        assertEquals("CityCar", result.getClass().getSimpleName());

        target = new TurboCarBuilder();
        result = target.sendCar("Curacao");

        result.start();
        result.breaking();
        result.accel();

        assertEquals("TurboCar", result.getClass().getSimpleName());

    }
}
