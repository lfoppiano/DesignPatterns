package org.foppiano.designpattern.strategy.sample.writer.strategies.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.foppiano.designpattern.strategy.sample.writer.strategies.OutputStrategy;

import java.io.*;

import static junit.framework.Assert.assertEquals;
/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 20/07/13
 * Time: 16:18
 * To change this template use File | Settings | File Templates.
 */
public class PlainTextOutputStrategyTest {

    OutputStrategy target;
    private String filename;

    @Before
    public void setUp() {
        target= new PlainTextOutputStrategy();
        filename = "ciao.text";
    }

    @After
    public void After() {
        new File(filename).delete();
    }

    @Test
    public void testWrite() throws IOException {
        target.write("ciao", filename);

        BufferedReader br = new BufferedReader( new FileReader(new File(filename)));
        String actual = br.readLine();

        assertEquals("ciao", actual);
    }
}
