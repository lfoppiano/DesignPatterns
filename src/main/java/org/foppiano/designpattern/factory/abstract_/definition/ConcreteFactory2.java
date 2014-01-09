package org.foppiano.designpattern.factory.abstract_.definition;

import org.foppiano.designpattern.factory.abstract_.definition.product.Product1;
import org.foppiano.designpattern.factory.abstract_.definition.product.Product2;
import org.foppiano.designpattern.factory.abstract_.definition.product.impl.ConcreteProduct1B;
import org.foppiano.designpattern.factory.abstract_.definition.product.impl.ConcreteProduct2B;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 09/01/14
 * Time: 08:59
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product1 createProduct1() {
        return new ConcreteProduct1B();
    }

    @Override
    public Product2 createProduct2() {
        return new ConcreteProduct2B();
    }
}
