package org.foppiano.designpattern.strategy.definition.context;

import org.foppiano.designpattern.strategy.definition.behaviour.impl.GoodBehaviour;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 10/07/13
 * Time: 12:46
 * To change this template use File | Settings | File Templates.
 */
public class Sample1Context extends Context {

    public Sample1Context() {
        this.setStrategyBehaviour(new GoodBehaviour());
    }
}
