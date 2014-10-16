package edu.macalester.comp124.critters;

import acm.graphics.GCompound;
import acm.graphics.GRect;

import java.awt.*;

/**
 * Created by Muath Ibaid on 10/10/2014.
 */
public class MuathLegs extends GCompound {

    public MuathLegs(){

        GRect leftLeg = new GRect(20, 70);
        GRect rightLeg = new GRect(20, 70);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(Color.blue);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(Color.blue);

        add(leftLeg);
        add(rightLeg);
    }
}
