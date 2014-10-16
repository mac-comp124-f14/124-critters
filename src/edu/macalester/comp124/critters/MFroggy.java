package edu.macalester.comp124.critters;

import acm.graphics.GArc;
import acm.graphics.GOval;

import java.awt.*;

/**
 * Created by mcartier on 10/16/14.
 */
public class MFroggy extends Critter{

    @Override
    protected void buildGraphics(){
        GOval rleg = new GOval(40, 80, 10, 40);
        rleg.setFilled(true);
        rleg.setFillColor(myColor2);
        addLeg(new Leg(rleg, 3));

        GOval lleg = new GOval(90, 80, 10, 40);
        lleg.setFilled(true);
        lleg.setFillColor(myColor2);
        addLeg(new Leg(lleg, 5));

        GOval larm = new GOval(0, 20, 40, 10);
        larm.setFilled(true);
        larm.setFillColor(myColor2);
        addLeg(new Leg(larm, 3));

        GOval rarm = new GOval(90, 20, 40, 10);
        rarm.setFilled(true);
        rarm.setFillColor(myColor2);
        addLeg(new Leg(rarm, 5));

        GOval bod = new GOval(20, 0, 100,100);
        bod.setFilled(true);
        bod.setFillColor(myColor);
        getGraphics().add(bod);

        GArc smile = new GArc(30, 30, 70, 45, 200, 160);
        getGraphics().add(smile);

        GOval dimple1 = new GOval(28,46,13, 13);
        dimple1.setFilled(true);
        dimple1.setFillColor(Color.red);
        getGraphics().add(dimple1);

        GOval dimple2 = new GOval(92, 45,13, 13);
        dimple2.setFilled(true);
        dimple2.setFillColor(Color.red);
        getGraphics().add(dimple2);

        addEye(new Eye(15, 0.3, 0.2, Color.BLUE), 46, 0);
        addEye(new Eye(20, 0.2, 0.3, new Color(105, 64, 215)), 80, 0);


    }



    private static final Color myColor = new Color(12, 238, 19);
    private static final Color myColor2 = new Color(75, 138, 26);

}
