package org.foppiano.designpattern.singleton.definition;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 22/01/14
 * Time: 07:55
 * This is the base singleton definition and it works well in case of concurrency access.
 * If the creation of the new object is a long process, it is done only the first time.
 */
public class SingletonClassEager {

    private static SingletonClassEager instance = new SingletonClassEager();

    private SingletonClassEager() {
    }

    public static SingletonClassEager getInstance() {
        return instance;
    }
}