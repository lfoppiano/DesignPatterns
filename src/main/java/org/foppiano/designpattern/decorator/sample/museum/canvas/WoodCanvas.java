package org.foppiano.designpattern.decorator.sample.museum.canvas;

import org.foppiano.designpattern.decorator.sample.museum.Painting;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 04/11/13
 * Time: 12:20
 * To change this template use File | Settings | File Templates.
 */
public class WoodCanvas extends Painting {
    @Override
    public String getDescription() {
        return "Wonderful wood canvas, painted brown";
    }

    @Override
    public Integer getValue() {
        return 1000;
    }

    @Override
    public Double getStealProbability() {
        return 0.1;
    }
}
