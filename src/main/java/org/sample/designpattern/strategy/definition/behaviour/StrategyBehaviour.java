package org.sample.designpattern.strategy.definition.behaviour;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 10/07/13
 * Time: 12:40
 * To change this template use File | Settings | File Templates.
 */

/**
 * Two tecniques,
 *   1. Context passes data to strategy - loosed coupled but for the increasing number of strategies, this can be inefficient as
 *          some more simple strategies don't need the data is passed
 *   2. Strategy gets context herself - tigher copuled but reduce the number of parameters and data passed from Strategy and Context
 */
public interface StrategyBehaviour {

    public void behave();

}
