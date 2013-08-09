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
public class CalmObserver implements Observer {
    public CalmObserver(Observable subject) {
        subject.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("OK. I've been notified!");
    }
}
