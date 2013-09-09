package org.foppiano.designpattern.decorator.sample.pizzeria.topping;

import org.foppiano.designpattern.decorator.sample.pizzeria.Pizza;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 09/09/13
 * Time: 09:03
 * To change this template use File | Settings | File Templates.
 */
public abstract class PizzaTopping extends Pizza {
    @Override
    public abstract Double getCost();

    @Override
    public abstract String getDescription();
}
