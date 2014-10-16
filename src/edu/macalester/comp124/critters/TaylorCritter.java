package edu.macalester.comp124.critters;

import acm.graphics.GCompound;
import acm.graphics.GOval;
import acm.graphics.GPolygon;

import java.awt.*;

/** Extends Critter, makes a cat?
 * Created by Taylor Rose on 10/16/2014.
 */
public class TaylorCritter extends Critter {

    @Override
    protected void buildGraphics() {
        GOval leftLeg = new GOval(10, 40, 10, 15);
        leftLeg.setFillColor(Color.ORANGE);
        leftLeg.setFilled(true);
        addLeg(new Leg(leftLeg, 2));

        GOval rightLeg = new GOval(30, 40, 10, 15);
        rightLeg.setFillColor(Color.ORANGE);
        rightLeg.setFilled(true);
        addLeg(new Leg(rightLeg, 1));

        GCompound bodyFace = new GCompound();
        GOval body = new GOval(-20, -30, 50, 50);
        body.setFillColor(Color.orange);
        body.setFilled(true);
        GPolygon earOne = triangle(0, 0, 20);
        earOne.setFillColor(Color.orange);
        earOne.setFilled(true);
        GPolygon earTwo = triangle(0, 0, 20);
        earTwo.setFillColor(Color.orange);
        earTwo.setFilled(true);
        GPolygon nose = triangle(15, 15, 10);
        nose.setFillColor(Color.pink);
        nose. setFilled(true);

        bodyFace.add(earOne, 3, 10);
        bodyFace.add(earTwo, 28, 10);
        bodyFace.add(body, 0, 0);
        bodyFace.add(nose, 5, 15);
        getGraphics().add(bodyFace);

        Eye leftEye = new Eye(6, 0.26, 0.18, Color.GREEN);
        Eye rightEye = new Eye(6, 0.26, 0.18, Color.GREEN);
        addEye(leftEye, 15, 16);
        addEye(rightEye, 40, 16);
    }

    private GPolygon triangle (double x, double y, double size) {
        GPolygon tri = new GPolygon();
        tri.addVertex(x, y);
        int angle = 0;
        for (int i = 0; i < 2; i++) {
            tri.addPolarEdge(size, angle);
            angle += 120;
        }
        tri.setFilled(true);
        tri.setFillColor(Color.white);
        return tri;
    }
}
