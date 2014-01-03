package org.foppiano.designpattern.decorator.sample.museum.content;

import org.foppiano.designpattern.decorator.sample.museum.Painting;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 04/11/13
 * Time: 12:26
 * To change this template use File | Settings | File Templates.
 */
public class DottedHouse extends Painting {
    Painting parent = null;

    public DottedHouse(Painting parent) {
        this.parent = parent;
    }

    @Override
    public String getDescription() {
        return parent.getDescription() + "\n" + "An house made of dots, very peculiar, similar to Van Gogh.";
    }

    @Override
    public Integer getValue() {
        return 4000 + parent.getValue();
    }

    @Override
    public Double getStealProbability() {
        return 0.2 + parent.getStealProbability();
    }
}
