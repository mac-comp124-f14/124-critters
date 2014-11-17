package edu.macalester.comp124.critters;

import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.graphics.GRect;

import java.awt.*;

/**
 * Created by ecavazos on 10/16/14.
 */
public class EmilyCritter extends Critter {

    @Override
    protected void buildGraphics() {

        GPolygon wing = new GPolygon();
        wing.addVertex(-35, 15);
        wing.addVertex(30, 15);
        wing.addVertex(0, 30);
        wing.setFilled(true);
        wing.setColor(new Color(235, 211, 40));
        getGraphics().add(wing, 25, -15);

        GPolygon wing2 = new GPolygon();
        wing2.addVertex(-30, 15);
        wing2.addVertex(30, 15);
        wing2.addVertex(0, 30);
        wing2.setFilled(true);
        wing2.setColor(new Color(235, 211, 40));
        getGraphics().add(wing2, -25, -15);

        GOval arm = new GOval(-35, 0, 30, 10);
        arm.setFilled(true);
        arm.setColor(new Color(92, 26, 166));
        getGraphics().add(arm);

        GOval arm2 = new GOval(5, 0, 30, 10);
        arm2.setFilled(true);
        arm2.setColor(new Color(92, 26, 166));
        getGraphics().add(arm2);

        GOval body = new GOval(-25, -25, 50, 60);
        body.setFilled(true);
        body.setColor(new Color(92, 26, 166));
        getGraphics().add(body);

        GOval foot1 = new GOval(-23, 30, 20, 10);
        foot1.setFilled(true);
        foot1.setColor(new Color(92, 26, 166));
        getGraphics().add(foot1);

        GOval foot2 = new GOval(7, 30 , 20, 10);
        foot2.setFilled(true);
        foot2.setColor(new Color(92, 26, 166));
        getGraphics().add(foot2);

        GPolygon horn = new GPolygon();
        horn.addVertex(-12, 15);
        horn.addVertex(12, 15);
        horn.addVertex(0, -15);
        horn.setFilled(true);
        horn.setColor(new Color(235, 211, 40));
        getGraphics().add(horn, 0, -35);

        Eye centerEye = new Eye(15, 0.46, 0.18, Color.green);
        addEye(centerEye, 0, -15);

        GOval mouth = new GOval(-5, 10, 15, 15);
        mouth.setFilled(true);
        mouth.setColor(Color.BLACK);
        getGraphics().add(mouth);





    }
}
