package org.foppiano.designpattern.factory.method.definition;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 02/01/14
 * Time: 12:47
 *
 * Factory Method Pattern: defines an interface for creating <b>an</b> object,
 * but lets his subclasses decide which object and which implementation
 * to use.
 */
public abstract class Creator {

    /** In this case is abstract, but it can be a default
     * implementation which any subclass can override if they need.
     */
    public abstract Product createMyCoreObject();

    public void operation(Product product)  {
        product.callMethod();
    }
}
