package edu.macalester.comp124.critters;

import acm.graphics.GCompound;
import acm.graphics.GRect;

import java.awt.*;

/**
 * Created by Muath Ibaid on 10/10/2014.
 */
public class MuathHands extends GCompound {

    public MuathHands(){
        GRect leftHand = new GRect(-55, 80, 50, 10);
        leftHand.setRotation(50);
        GRect rightHand = new GRect(45, 70, 10, 50);
        rightHand.setRotation(50);

        leftHand.setFilled(true);
        leftHand.setFillColor(Color.green);

        rightHand.setFilled(true);
        rightHand.setFillColor(Color.green);


        //add(leftHand);
        //add(rightHand);

    }
}
