package org.foppiano.designpattern.observer.sample.notification.events;

import org.foppiano.designpattern.observer.sample.notification.display.MessageDisplay;
import org.foppiano.designpattern.observer.sample.notification.display.WeatherDisplay;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 18/08/13
 * Time: 12:45
 * This integration test gives you an idea on how the classes are working together.
 * The notification takes a String (but the idea is that takes a stream or an object) and notify the Displays
 * when something change.
 *
 * The logic to understand what to notify is in the display itself, mainly for simplicity
 * in theory if the number of displays are increasing would be better to have a more separated
 * set of logic to notify only the displays that should be notified.
 *
 */
public class NotificationCenterIntegrationTest {
    NotificationCenter target;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testSimpleRead1() {
        target = new NotificationCenter("abc:1234556\ndef:fdsafdsafasd\nw:12,2333\n");

        target.addObserver(new MessageDisplay());
        target.addObserver(new WeatherDisplay());

        target.activate();

    }


    @Test
    public void testSimpleRead2() {
        target = new NotificationCenter("m:dear lover, see you tonight!\ndef:fdsafdsafasd\nfdsafdsafasd\nfdsafdsafadsf\nm:Dear mr Bao, how are you doing? Please send me back your CV asap.\nw:12,2333\n");

        target.addObserver(new MessageDisplay());
        target.addObserver(new WeatherDisplay());

        target.activate();

    }


}
