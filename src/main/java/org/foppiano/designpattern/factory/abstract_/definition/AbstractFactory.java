package org.foppiano.designpattern.factory.abstract_.definition;

import org.foppiano.designpattern.factory.abstract_.definition.product.Product1;
import org.foppiano.designpattern.factory.abstract_.definition.product.Product2;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 09/01/14
 * Time: 08:56
 * To change this template use File | Settings | File Templates.
 */
public interface AbstractFactory {

    Product1 createProduct1();

    Product2 createProduct2();

}
