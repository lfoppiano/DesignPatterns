package org.foppiano.designpattern.strategy.sample.writer.strategies;

import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 20/07/13
 * Time: 16:02
 * To change this template use File | Settings | File Templates.
 */
public interface OutputStrategy {

    boolean write(String input, String filename);

    boolean write(InputStream input, String filename);
}
