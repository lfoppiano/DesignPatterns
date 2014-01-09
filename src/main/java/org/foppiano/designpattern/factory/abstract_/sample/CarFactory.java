package org.foppiano.designpattern.factory.abstract_.sample;

import org.foppiano.designpattern.factory.abstract_.sample.product.CarEngine;
import org.foppiano.designpattern.factory.abstract_.sample.product.CarFrame;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 06/01/14
 * Time: 09:45
 * To change this template use File | Settings | File Templates.
 */
public interface CarFactory {

    CarFrame createFrame();

    CarEngine createEngine();
}
