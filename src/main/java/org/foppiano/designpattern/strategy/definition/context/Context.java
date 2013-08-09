package org.foppiano.designpattern.strategy.definition.context;

import org.foppiano.designpattern.strategy.definition.behaviour.StrategyBehaviour;
import org.foppiano.designpattern.strategy.definition.behaviour.impl.DefaultBehaviour;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 10/07/13
 * Time: 12:43
 * To change this template use File | Settings | File Templates.
 */
public abstract class Context {

    private StrategyBehaviour strategyBehaviour = new DefaultBehaviour();

    /*public Context(StrategyBehaviour strategyBehaviour) {
        this.strategyBehaviour = strategyBehaviour;
    }*/

    public void behave() {
        //default behaviour if no strategy has been added
        strategyBehaviour.behave();

    }

    public void setStrategyBehaviour(StrategyBehaviour strategyBehaviour) {
        this.strategyBehaviour = strategyBehaviour;
    }

}
