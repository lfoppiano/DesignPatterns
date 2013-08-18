package org.foppiano.designpattern.observer.sample.notification.events;

import org.foppiano.designpattern.observer.sample.notification.model.weather.Weather;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 18/08/13
 * Time: 13:04
 * To change this template use File | Settings | File Templates.
 */
public class EventManager {

    public Object identify(String event) {

        Object o = null;

        //simple implementation, don't bother with it please
        if (event.startsWith("w:")) {
            event = event.replace("w:", "");
            String temperature = event.split(",")[0];
            String pressure = event.split(",")[1];
            o = new Weather(temperature, pressure);

        } else if (event.startsWith("m:")) {
            String message = event.replace("m:", "");

            o = new String(message);
        }

        return o;
    }

}
