package org.sample.designpattern.strategy.sample.writer.strategies.impl;

import org.sample.designpattern.strategy.sample.writer.strategies.OutputStrategy;

import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 20/07/13
 * Time: 16:08
 * To change this template use File | Settings | File Templates.
 */
public class CsvTextOutputStrategy implements OutputStrategy {
    @Override
    public boolean write(String input, String filename) {
        //Making it generic for ANY csv is non sense... for this example is only based on the input file... see
        //unit tests
        File output = new File(filename);

        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter(output));

            List<String> lines = Arrays.asList(input.split("\n"));
            Iterator it = lines.iterator();


            while(it.hasNext())  {
                String next = (String) it.next();
                List<String> tokens = Arrays.asList(next.split("   "));

                Iterator it2 = tokens.iterator();
                String line = "";
                while(it2.hasNext()) {
                    line += it2.next().toString().trim() + ";";
                }

                out.println(line.substring(0, line.length()-1));
            }

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
        throw new UnsupportedOperationException("Not yet implemented. In the new version. next year. ");
    }
}
