package org.foppiano.designpattern.factory.method.definition.impl;

import org.foppiano.designpattern.factory.method.definition.Product;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 02/01/14
 * Time: 12:51
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteProduct implements Product {
    @Override
    public void callMethod() {
        System.out.println("I'm calling something");
    }
}
