package edu.macalester.comp124.critters;

import acm.graphics.GArc;

import java.awt.*;

/**
 * Created by mcartier on 10/16/14.
 */
public class Ball extends Critter{

    @Override
    public void buildGraphics(){
        GArc a = new GArc(30,30,0,60);
        a.setFilled(true);
        a.setFillColor(Color.cyan);
        addLeg(new Leg(a, 20));

        GArc a1 = new GArc(30,30,60,60);
        a1.setFilled(true);
        a1.setFillColor(Color.magenta);
        addLeg(new Leg(a1, 20));

        GArc a2 = new GArc(30,30,120,60);
        a2.setFilled(true);
        a2.setFillColor(Color.blue);
        addLeg(new Leg(a2, 20));

        GArc a3 = new GArc(30,30,180,60);
        a3.setFilled(true);
        a3.setFillColor(Color.yellow);
        addLeg(new Leg(a3, 20));

        GArc a4 = new GArc(30,30,240,60);
        a4.setFilled(true);
        a4.setFillColor(Color.green);
        addLeg(new Leg(a4, 20));

        GArc a5 = new GArc(30,30,300,60);
        a5.setFilled(true);
        a5.setFillColor(Color.red);
        addLeg(new Leg(a5, 20));
    }
}
