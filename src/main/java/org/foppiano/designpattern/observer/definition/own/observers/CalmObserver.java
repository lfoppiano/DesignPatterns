package org.foppiano.designpattern.observer.definition.own.observers;


import org.foppiano.designpattern.observer.definition.own.Observer;
import org.foppiano.designpattern.observer.definition.own.Subject;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 09/08/13
 * Time: 09:07
 * To change this template use File | Settings | File Templates.
 */
public class CalmObserver implements Observer {

    Subject observed;

    public CalmObserver(Subject subject) {
        this.observed = subject;
        observed.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("I'm updating myself! Cheers! ");
    }
}
