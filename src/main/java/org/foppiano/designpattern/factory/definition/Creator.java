package org.foppiano.designpattern.factory.definition;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 02/01/14
 * Time: 12:47
 *
 * Factory Method Pattern: defines an interface for creating an object,
 * but lets his subclasses decide which object and which implementation
 * to use.
 */
public abstract class Creator {

    public abstract Product createMyCoreObject();

    public void operation(Product product)  {
        product.callMethod();
    }
}
