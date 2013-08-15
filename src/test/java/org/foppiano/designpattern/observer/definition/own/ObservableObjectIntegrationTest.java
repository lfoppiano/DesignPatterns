package org.foppiano.designpattern.observer.definition.own;

import org.foppiano.designpattern.observer.definition.own.observers.CalmObserver;
import org.foppiano.designpattern.observer.definition.own.observers.WildObserver;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 09/08/13
 * Time: 09:12
 * To change this template use File | Settings | File Templates.
 */
public class ObservableObjectIntegrationTest {
    ObservableObject target;

    @Before
    public void setUp() throws Exception {
        target = new ObservableObject();

        WildObserver wo = new WildObserver(target);
        CalmObserver co = new CalmObserver(target);
    }

    @Test
    public void testSetAttributeAndNotification() throws Exception {
        target.setState(1234);
        target.setState(1234);
        target.setState(1000);
    }

    @Test
    public void testWithNoObservers() throws Exception {
        target = new ObservableObject();

        target.setState(123455667);
    }
}
