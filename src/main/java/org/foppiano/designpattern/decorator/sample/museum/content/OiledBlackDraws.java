package org.foppiano.designpattern.decorator.sample.museum.content;

import org.foppiano.designpattern.decorator.sample.museum.Painting;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 04/11/13
 * Time: 12:26
 * To change this template use File | Settings | File Templates.
 */
public class OiledBlackDraws extends Painting {
    Painting parent = null;

    public OiledBlackDraws(Painting parent) {
        this.parent = parent;
    }

    @Override
    public String getDescription() {
        return parent.getDescription() + "\n" + "Oiled Black draws, resembling the old world war. ";
    }

    @Override
    public Integer getValue() {
        return 67000 + parent.getValue();
    }

    @Override
    public Double getStealProbability() {
        return 0.1 + parent.getStealProbability();
    }
}
