package org.sample.designpattern.strategy.sample.writer.strategies.impl;

import org.sample.designpattern.strategy.sample.writer.strategies.OutputStrategy;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 20/07/13
 * Time: 15:59
 * To change this template use File | Settings | File Templates.
 */
public class PlainTextOutputStrategy implements OutputStrategy {

    @Override
    public boolean write(String input, String filename){
        File output = new File(filename);

        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter(output));
            out.println(input);
        } catch (IOException e) {
            e.printStackTrace();

            output.delete();
            return false;
        } finally {
            if(out != null){
                out.close();
                out.flush();
            }
        }

        return true;

    }

    @Override
    public boolean write(InputStream input, String filename) {
        throw new UnsupportedOperationException("Not yet implemented. Try again in three months.");
    }
}
