package org.foppiano.designpattern.observer.sample.notification.model.weather;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 18/08/13
 * Time: 12:37
 * To change this template use File | Settings | File Templates.
 */
public class Weather {
    private String temperature;
    private String pressure;

    public Weather(String temperature, String pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }
}
