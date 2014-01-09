package org.foppiano.designpattern.factory.abstract_.sample;

import org.foppiano.designpattern.factory.abstract_.sample.product.CarEngine;
import org.foppiano.designpattern.factory.abstract_.sample.product.CarFrame;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 09/01/14
 * Time: 08:35
 * To change this template use File | Settings | File Templates.
 */
public class Car {
    CarEngine engine;
    CarFrame frame;

    CarFactory factory;

    public Car(CarFactory factory) {
        this.factory = factory;
    }

    public void assemblyCar(){
        this.engine = factory.createEngine();
        this.frame = factory.createFrame();
    }
}
