package org.foppiano.designpattern.observer.definition;

import org.foppiano.designpattern.observer.definition.java.observers.CalmObserver;
import org.foppiano.designpattern.observer.definition.java.ObservableObject;
import org.foppiano.designpattern.observer.definition.java.observers.WildObserver;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 09/08/13
 * Time: 09:12
 * To change this template use File | Settings | File Templates.
 */
public class ObservableObjectTest {
    ObservableObject oo;

    @Before
    public void setUp() throws Exception {
        oo = new ObservableObject();
        WildObserver wo = new WildObserver(oo);
        CalmObserver co = new CalmObserver(oo);
    }

    @Test
    public void testSetAttributeAndNotification() throws Exception {
        oo.setAttribute(1234);
        oo.setAttribute(1234);
        oo.setAttribute(1000);
    }
}
