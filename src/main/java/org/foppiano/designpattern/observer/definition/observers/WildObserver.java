package org.foppiano.designpattern.observer.definition.observers;

import java.util.Observable;
import java.util.Observer;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 09/08/13
 * Time: 09:07
 * To change this template use File | Settings | File Templates.
 */
public class WildObserver implements Observer {

    public WildObserver(Observable subject) {
        subject.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("YAHOOOOOO!!!!! I've been notified!");
    }
}
