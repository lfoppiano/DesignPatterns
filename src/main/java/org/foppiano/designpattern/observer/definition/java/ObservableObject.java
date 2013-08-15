package org.foppiano.designpattern.observer.definition.java;

import java.util.Observable;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 09/08/13
 * Time: 09:03
 * Implementation using the java API internal
 */
public class ObservableObject extends Observable{

    private Integer attribute;

    public ObservableObject() {
        attribute = 0;
    }

    public void setAttribute(Integer newAttribute) {
        if(!this.attribute.equals(newAttribute)) setChanged();

        this.attribute = newAttribute;

        notifyObservers(); //pull notification: the observer get nothing from me
    }

}
