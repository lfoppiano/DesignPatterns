package org.foppiano.designpattern.observer.definition.own;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 15/08/13
 * Time: 08:44
 * To change this template use File | Settings | File Templates.
 */
public interface Subject {

    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObservers();

}
