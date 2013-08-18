package org.foppiano.designpattern.observer.sample.notification.events;

import java.io.InputStream;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 18/08/13
 * Time: 12:42
 * To change this template use File | Settings | File Templates.
 */
public class NotificationCenter extends Observable{
    private final List<String> events;
    private EventManager eventManager;
    //ideally this would be an ideal input
    /*public NotificationCenter(InputStream input) {

    }*/

    public NotificationCenter(String input) {
        //for simplicity we use a simple String
        eventManager = new EventManager();
        events = Arrays.asList(input.split("\n"));
    }

    public void activate() {

        Iterator i = events.iterator();
        while(i.hasNext()) {

            //I know they are stored as string
            final String nextEvent = (String) i.next();
            Object event = eventManager.identify(nextEvent);

            if (event != null){
                setChanged();
            }

            notifyObservers(event);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //blah
            }
        }
    }

}
