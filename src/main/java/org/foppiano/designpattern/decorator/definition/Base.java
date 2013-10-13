package org.foppiano.designpattern.decorator.definition;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 13/10/13
 * Time: 15:14
 * To change this template use File | Settings | File Templates.
 */
public abstract class Base {
    private String information2;

    public String getInformation1() {
        return this.getClass().getName();
    }

    public String getInformation2() {
        return information2;
    }
}
