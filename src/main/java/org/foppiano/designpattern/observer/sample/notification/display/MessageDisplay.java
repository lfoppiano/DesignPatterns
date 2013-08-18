package org.foppiano.designpattern.observer.sample.notification.display;

import java.util.Observable;
import java.util.Observer;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 18/08/13
 * Time: 12:30
 * To change this template use File | Settings | File Templates.
 */
public class MessageDisplay implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        String message = "";
        if (arg instanceof String) {
            message = (String) arg;
            System.out.println("New message received " + message);
        }

    }
}
