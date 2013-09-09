package org.foppiano.designpattern.decorator.sample.pizzeria.dough;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 09/09/13
 * Time: 08:59
 * To change this template use File | Settings | File Templates.
 */
public class IntegralDough extends PizzaDough{
    @Override
    public Double getCost() {
        return 7.0;
    }

    @Override
    public String getDescription() {
        return "Healthy integral dough";
    }
}
