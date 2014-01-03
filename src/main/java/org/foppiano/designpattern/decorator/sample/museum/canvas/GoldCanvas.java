package org.foppiano.designpattern.decorator.sample.museum.canvas;

import org.foppiano.designpattern.decorator.sample.museum.Painting;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 04/11/13
 * Time: 12:20
 * To change this template use File | Settings | File Templates.
 */
public class GoldCanvas extends Painting {

    @Override
    public String getDescription() {
        return "Amazing gold canvas, very cool and shiny.";
    }

    @Override
    public Integer getValue() {
        return 400000;
    }

    @Override
    public Double getStealProbability() {
        return 0.5;
    }
}
