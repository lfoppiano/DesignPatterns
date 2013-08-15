package org.foppiano.designpattern.observer.definition.own;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 15/08/13
 * Time: 08:47
 * Implementation without using JAVA API
 */
public class ObservableObject implements Subject {

    private List<Observer> observers;

    public ObservableObject() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update();
        }
    }

    public void setState() {
        //changing something

        notifyObservers();
    }


}
