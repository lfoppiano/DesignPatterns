package org.foppiano.designpattern.decorator.sample.pizzeria.topping;

import org.foppiano.designpattern.decorator.sample.pizzeria.Pizza;
import org.foppiano.designpattern.decorator.sample.pizzeria.dough.PizzaDough;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 09/09/13
 * Time: 09:02
 * To change this template use File | Settings | File Templates.
 */
public class Salami extends PizzaTopping{
    Pizza base;

    public Salami(Pizza base) {
        this.base = base;
    }

    @Override
    public Double getCost() {
        return .7 + base.getCost();
    }

    @Override
    public String getDescription() {
        return base.getDescription() + "Salami. ";
    }
}
