package org.foppiano.designpattern.decorator.sample.museum;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 04/11/13
 * Time: 12:16
 * To change this template use File | Settings | File Templates.
 */
public abstract class Painting {
    private String description = "no description";
    private Integer value = 0;
    private Double stealProbability = 0.0;

    public abstract String getDescription();

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract Integer getValue();

    public void setValue(Integer value) {
        this.value = value;
    }

    public abstract Double getStealProbability();

    public void setStealProbability(Double stealProbability) {
        this.stealProbability = stealProbability;
    }

    public String toString() {
        return "PAINTING \n Description: "+this.getDescription() + ". \n Value: "+ this.getValue() + ". \n Probability to get stolen: " + this.getStealProbability();
    }

}
