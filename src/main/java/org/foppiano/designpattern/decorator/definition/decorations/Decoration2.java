package org.foppiano.designpattern.decorator.definition.decorations;

import org.foppiano.designpattern.decorator.definition.Base;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 13/10/13
 * Time: 15:14
 * To change this template use File | Settings | File Templates.
 */
public class Decoration2 extends BaseDecoration {
    Base base = null;

    public Decoration2(Base base) {
        this.base = base;
    }
    @Override
    public String getInformation2() {
        return base.getInformation2() + "funny information";
    }
}
