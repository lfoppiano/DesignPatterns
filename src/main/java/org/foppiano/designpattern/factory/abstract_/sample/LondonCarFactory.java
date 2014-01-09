package org.foppiano.designpattern.factory.abstract_.sample;

import org.foppiano.designpattern.factory.abstract_.sample.product.CarEngine;
import org.foppiano.designpattern.factory.abstract_.sample.product.CarFrame;
import org.foppiano.designpattern.factory.abstract_.sample.product.impl.LightFrame;
import org.foppiano.designpattern.factory.abstract_.sample.product.impl.TurboCarEngine;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 09/01/14
 * Time: 08:34
 * To change this template use File | Settings | File Templates.
 */
public class LondonCarFactory implements CarFactory {
    @Override
    public CarFrame createFrame() {
        return new LightFrame();
    }

    @Override
    public CarEngine createEngine() {
        return new TurboCarEngine();
    }
}
