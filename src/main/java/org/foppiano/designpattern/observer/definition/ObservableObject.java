package org.foppiano.designpattern.observer.definition;

import java.util.Observable;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 09/08/13
 * Time: 09:03
 * To change this template use File | Settings | File Templates.
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
