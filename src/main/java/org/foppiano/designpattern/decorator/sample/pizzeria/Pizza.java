package org.foppiano.designpattern.decorator.sample.pizzeria;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 09/09/13
 * Time: 08:55
 * To change this template use File | Settings | File Templates.
 */
public abstract class Pizza {

    String description = "no description";

    public abstract Double getCost();

    public String getDescription() {
        return description;
    }

}
