package org.foppiano.designpattern.factory.abstract_.definition.product;

import org.foppiano.designpattern.factory.abstract_.definition.AbstractFactory;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 09/01/14
 * Time: 08:58
 * To change this template use File | Settings | File Templates.
 */
public class Client {

    AbstractFactory factory;

    public Client(AbstractFactory factory) {
        this.factory = factory;
    }

    public void creation() {
        factory.createProduct1();
        factory.createProduct2();
    }

}
