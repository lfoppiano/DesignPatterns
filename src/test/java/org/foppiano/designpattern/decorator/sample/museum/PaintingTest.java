package org.foppiano.designpattern.decorator.sample.museum;

import org.foppiano.designpattern.decorator.sample.museum.canvas.GoldCanvas;
import org.foppiano.designpattern.decorator.sample.museum.canvas.WoodCanvas;
import org.foppiano.designpattern.decorator.sample.museum.content.DottedHouse;
import org.foppiano.designpattern.decorator.sample.museum.content.OiledBlackDraws;
import org.foppiano.designpattern.decorator.sample.museum.content.YellowLandscape;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: lf84914
 * Date: 04/11/13
 * Time: 12:29
 * To change this template use File | Settings | File Templates.
 */
public class PaintingTest {
    @Test
    public void testGetDescription() throws Exception {
        Painting root = new WoodCanvas();

        Painting monna = new YellowLandscape(root);
        Painting lisa = new OiledBlackDraws(monna);

        System.out.println(monna.toString());
        System.out.println(lisa.toString());

        Painting pinta = new DottedHouse(new YellowLandscape(new GoldCanvas()));

        System.out.println(pinta.toString());


    }
}
