package org.foppiano.designpattern.observer.sample.notification.display;

import org.foppiano.designpattern.observer.sample.notification.model.weather.Weather;

import java.util.Observable;
import java.util.Observer;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 18/08/13
 * Time: 12:30
 * To change this template use File | Settings | File Templates.
 */
public class WeatherDisplay implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        String message = "";
        if (arg instanceof Weather) {
            Weather weather = (Weather) arg;
            message = weather.getPressure() +", "+ weather.getTemperature();
            System.out.println("New weather forecast received " + message);
        }

    }

}
