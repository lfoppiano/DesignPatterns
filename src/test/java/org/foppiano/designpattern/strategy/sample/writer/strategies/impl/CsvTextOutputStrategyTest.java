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
 * Time: 16:19
 * To change this template use File | Settings | File Templates.
 */
public class CsvTextOutputStrategyTest {
    OutputStrategy target;
    private String fileName;

    @Before
    public void setUp() {
        target= new CsvTextOutputStrategy();

        fileName = "ciao.csv";
    }

    @After
    public void After() {
        new File(fileName).delete();
    }

    @Test
    public void testWrite() throws IOException {
        target.write("ciao   amici   della   sera\namici della notte fonda", fileName);

        BufferedReader br = new BufferedReader( new FileReader(new File(fileName)));
        String actual = br.readLine();

        assertEquals("ciao;amici;della;sera", actual);

    }
}
