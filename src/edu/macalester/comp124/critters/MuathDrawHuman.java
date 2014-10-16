package edu.macalester.comp124.critters;

import acm.graphics.GPoint;
import acm.graphics.GRect;

import java.awt.*;

/**
 * Created by Muath Ibaid on 10/10/2014.
 */
public class MuathDrawHuman extends Critter {
    private GPoint clickedPoint = null;


    MuathHuman movingBret = null;
    MuathHuman movingBret2 =null;

    @Override
    protected void buildGraphics() {



//        GRect leftLeg = new GRect(198, 230, 18, 70);
//        GRect rightLeg = new GRect(225, 230, 18, 70);
//        leftLeg.setFilled(true);
//        leftLeg.setFillColor(Color.black);
//        rightLeg.setFilled(true);
//        rightLeg.setFillColor(Color.black);
//        addLeg(new Leg(leftLeg, 3));
//        addLeg(new Leg(rightLeg, 3));

        movingBret = new MuathHuman();
        //getGraphics().add(movingBret, 200, 100);

        GRect leftLeg2 = new GRect(248, 220, 18, 30);
        GRect rightLeg2 = new GRect(275, 220, 18, 30);
        leftLeg2.setFilled(true);
        leftLeg2.setFillColor(Color.green);
        rightLeg2.setFilled(true);
        rightLeg2.setFillColor(Color.green);
        addLeg(new Leg(leftLeg2, 1));
        addLeg(new Leg(rightLeg2, 1));

        movingBret2 = new MuathHuman();
        getGraphics().add(movingBret2, 250, 100);



        GRect leftHand = new GRect(242, 180, 20, 15);
        leftHand.setRotation(23);
        GRect rightHand = new GRect(297, 180, 15, 20);
        rightHand.setRotation(23);
        addLeg(new Leg(leftHand, 5));
        addLeg(new Leg(rightHand, 5));
        leftHand.setFilled(true);
        leftHand.setFillColor(Color.green);
        rightHand.setFilled(true);
        rightHand.setFillColor(Color.green);

    }

}



