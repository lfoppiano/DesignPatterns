package org.foppiano.designpattern.decorator.sample.pizzeria;

import org.foppiano.designpattern.decorator.sample.pizzeria.dough.PlainDough;
import org.foppiano.designpattern.decorator.sample.pizzeria.topping.Basilicum;
import org.foppiano.designpattern.decorator.sample.pizzeria.topping.Mozzarella;
import org.foppiano.designpattern.decorator.sample.pizzeria.topping.Tomato;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 09/09/13
 * Time: 09:15
 * To change this template use File | Settings | File Templates.
 */
public class PizzeriaIntegrationTest {

    @Test
    public void testPizzaPizza() throws Exception {
        Pizza pizza1 = new PlainDough();
        pizza1 = new Basilicum(pizza1);
        pizza1 = new Tomato(pizza1);
        pizza1 = new Mozzarella(pizza1);

        System.out.println(pizza1.getCost());
        System.out.println(pizza1.getDescription());
    }



}
