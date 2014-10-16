package edu.macalester.comp124.critters;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.graphics.GLabel;

import java.awt.Color;

/**
 * An awesome critter
 */
public class BrianE extends Critter {


    @Override
    protected void buildGraphics() {

        GLine leg1 = new GLine(-30,10,-40,100);
        leg1.setColor(Color.GRAY);
        addLeg(new Leg(leg1,4));

        GLine leg2 = new GLine(30,10,40,100);
        leg2.setColor(Color.GRAY);
        addLeg(new Leg(leg2,4));

        GLine leg3 = new GLine(-30,10,-20,100);
        leg3.setColor(Color.GRAY);
        addLeg(new Leg(leg3,4));

        GLine leg4 = new GLine(30,10,20,100);
        leg4.setColor(Color.GRAY);
        addLeg(new Leg(leg4,4));

        GLine leg5 = new GLine(-10,10,-20,100);
        leg5.setColor(Color.GRAY);
        addLeg(new Leg(leg5,2));

        GLine leg6 = new GLine(-10,10,0,100);
        leg6.setColor(Color.GRAY);
        addLeg(new Leg(leg6,2));

        GLine leg7 = new GLine(10,10,0,100);
        leg7.setColor(Color.GRAY);
        addLeg(new Leg(leg7,2));

        GLine leg8 = new GLine(10,10,20,100);
        leg8.setColor(Color.GRAY);
        addLeg(new Leg(leg8,2));

        GRect body = new GRect(-50,0,100,10);
        body.setColor(Color.BLACK);
        body.setFilled(true);
        body.setFillColor(Color.ORANGE);
        getGraphics().add(body);

        /*GOval head = new GOval(50,-10,20,20);
        head.setColor(Color.BLACK);
        head.setFilled(true);
        head.setFillColor(Color.DARK_GRAY);
        getGraphics().add(head);

        GLabel label = new GLabel("DEMON",-30,-10);
        getGraphics().add(label);*/

        Eye eye = new Eye(40,0.5,0.5,Color.RED);
        addEye(eye,60,0);
    }
}
