package org.foppiano.designpattern.decorator.sample.pizzeria;

import org.foppiano.designpattern.decorator.sample.pizzeria.dough.IntegralDough;
import org.foppiano.designpattern.decorator.sample.pizzeria.dough.PlainDough;
import org.foppiano.designpattern.decorator.sample.pizzeria.topping.Basilicum;
import org.foppiano.designpattern.decorator.sample.pizzeria.topping.Mozzarella;
import org.foppiano.designpattern.decorator.sample.pizzeria.topping.Tomato;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

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

        assertThat(pizza1.getCost(), is(6.2));
        assertThat(pizza1.getDescription(), is("Plain Pizza, Basilicum, Tomato, Mozzarella, "));
    }

    @Test
    public void testPizzaWithALootOfMozzarella() throws Exception {
        Pizza pizza2 = new IntegralDough();
        pizza2 = new Basilicum(pizza2);
        pizza2 = new Mozzarella(pizza2);
        pizza2 = new Mozzarella(pizza2);
        pizza2 = new Mozzarella(pizza2);
        pizza2 = new Tomato(pizza2);

        assertThat(pizza2.getCost(), is(9.2));
        assertThat(pizza2.getDescription(), is("Healthy integral dough, Basilicum, Mozzarella, Mozzarella, Mozzarella, Tomato, "));
    }
}
