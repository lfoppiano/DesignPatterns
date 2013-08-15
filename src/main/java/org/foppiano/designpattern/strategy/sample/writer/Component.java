package org.foppiano.designpattern.strategy.sample.writer;

import org.foppiano.designpattern.strategy.sample.writer.strategies.impl.CsvTextOutputStrategy;
import org.foppiano.designpattern.strategy.sample.writer.strategies.impl.PlainTextOutputStrategy;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 20/07/13
 * Time: 16:47
 * To change this template use File | Settings | File Templates.
 */
public class Component {

    public void writePlain() {
        WriterContext out = new WriterContext(new PlainTextOutputStrategy());

       out.write("maronna", "file1");
        out.write("baoboa", "file2");
        out.write("maronnnaaaazza", "file3");

        out = new WriterContext(new CsvTextOutputStrategy());

        out.write("maronna   dfdfdf   dfdfd   dfdfdfd", "file1.csv");
        out.write("baoboa fdfdfdff fdfd   dfdfdfdfd   fdfdfdfdfd   dfdfdfdf\nfdfdfdfd   dfdfdfdfd   dfdfdf", "file2.csv");
        out.write("maronnnaaaazza", "file3.csv");


    }

    public static void main(String... args) {
        new Component().writePlain();
    }
}
