package edu.macalester.comp124.critters;

import acm.graphics.GOval;
import acm.graphics.GPolygon;

import java.awt.*;

/**
 * Created by sfaridan on 10/16/14.
 */
public class FaridaniCritter extends Critter {

    private GOval cicler;
    private boolean ciclerMovingRight;
    private final int rightMost = 100;
    private final int ycoord = -40;
    private final int period = 1;

    @Override
    protected void buildGraphics() {
        createLeg(-30,  10, -40,  20);
        createLeg(-34, -10, -44,   0);
        createLeg(-30, -30, -40, -20);
        createLeg( 30,  10,  40,  20);
        createLeg( 34, -10,  44,   0);
        createLeg( 30, -30,  40, -20);

        Eye eye = new Eye(60, 0.46, 0.28, Color.GREEN);
        addEye(eye, 0, 0);
        cicler = new GOval(15,15);
        cicler.setFilled(true);
        cicler.setFillColor(Color.GREEN);
        getGraphics().add(cicler, 0, ycoord);
    }

    private void createLeg(double x0, double y0, double x1, double y1) {
        x1 *= 3;
        y1 *=3;
        x0 *= 3;
        y0 *= 3;

        GPolygon legPoly = new GPolygon();
        legPoly.setColor(new Color(90, 200, 70));
        legPoly.setFilled(true);
        legPoly.setFillColor(legPoly.getColor());

        legPoly.addVertex(0, -2);
        legPoly.addVertex(x0, y0 - 1);
        legPoly.addVertex(x1, y1);
        legPoly.addVertex(x0, y0 + 1);
        legPoly.addVertex(0, 2);

        addLeg(new Leg(legPoly, 4));
    }

    public void moveBy(double dx, double dy, double dt){
        super.moveBy(dx, dy, dt);

        if(ciclerMovingRight){
            cicler.move(22 * Math.sin(Math.PI * (cicler.getX() + rightMost) / (rightMost * 2)) + 1.5, 0);
            cicler.sendToFront();
        }
        else{
            cicler.move(22 * Math.sin(Math.PI * (cicler.getX() - rightMost) / (rightMost * 2)) - 1.5, 0);
            cicler.sendToBack();
        }

        if(cicler.getX() >= rightMost){
            ciclerMovingRight = false;
        }
        else if(cicler.getX() <= -rightMost){
            ciclerMovingRight = true;
        }

    }
}
