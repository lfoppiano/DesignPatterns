package org.foppiano.designpattern.factory.method.definition.impl;

import org.foppiano.designpattern.factory.method.definition.Creator;
import org.foppiano.designpattern.factory.method.definition.Product;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 02/01/14
 * Time: 12:50
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteCreator extends Creator {
    @Override
    public Product createMyCoreObject() {
        return new ConcreteProduct();
    }
}
