package org.foppiano.designpattern.strategy.definition.behaviour.impl;

import org.foppiano.designpattern.strategy.definition.behaviour.StrategyBehaviour;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 10/07/13
 * Time: 13:05
 * To change this template use File | Settings | File Templates.
 */
public class DefaultBehaviour implements StrategyBehaviour{
    @Override
    public void behave() {
        System.out.println("default behaviour!");
    }
}
