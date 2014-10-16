package edu.macalester.comp124.critters;

import acm.graphics.GCompound;
import acm.graphics.GOval;

import java.awt.*;

/**
 * Created by Muath Ibaid on 10/13/2014.
 */
public class MuathHair extends GCompound {

    public MuathHair(){
        GOval hair = new GOval(6, 0, 30, 8);
        hair.setFilled(true);
        hair.setFillColor(Color.white);
        add(hair);
    }
}
