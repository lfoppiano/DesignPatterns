package org.foppiano.designpattern.singleton.definition;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 22/01/14
 * Time: 07:55
 * This is the base singleton definition. It doesn't take care of concurrent accesses to
 * the method getInstance()
 */
public class SingletonClass {

    private static SingletonClassEager instance = null;

    private SingletonClass() {}

    public static SingletonClassEager getInstance() {
        if (instance != null) {
            instance = new SingletonClassEager();
        }

        return instance;
    }
}
