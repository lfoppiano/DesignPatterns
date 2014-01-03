package org.foppiano.designpattern.decorator.sample.museum.content;

import org.foppiano.designpattern.decorator.sample.museum.Painting;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 04/11/13
 * Time: 12:26
 * To change this template use File | Settings | File Templates.
 */
public class YellowLandscape extends Painting{
    Painting parent = null;

    public YellowLandscape(Painting parent) {
        this.parent = parent;
    }

    @Override
    public String getDescription() {
        return parent.getDescription() + "\n" + "Yellow drawer landscape. Favorable on the amazing color fo the evening.";
    }

    @Override
    public Integer getValue() {
        return 7000 + parent.getValue();
    }

    @Override
    public Double getStealProbability() {
        return 0.6 + parent.getStealProbability();
    }
}
