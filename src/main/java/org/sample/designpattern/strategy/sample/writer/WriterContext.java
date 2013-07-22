package org.sample.designpattern.strategy.sample.writer;

import org.sample.designpattern.strategy.sample.writer.strategies.OutputStrategy;
import org.sample.designpattern.strategy.sample.writer.strategies.impl.PlainTextOutputStrategy;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 20/07/13
 * Time: 15:57
 * To change this template use File | Settings | File Templates.
 */
public class WriterContext {

    OutputStrategy strategy;

    WriterContext(OutputStrategy initialStrategy) {
        this.strategy = initialStrategy;
    }

    public boolean write(String input, String filename) {
        return strategy.write(input, filename);
    }

}
