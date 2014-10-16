package edu.macalester.comp124.critters;

import acm.graphics.GImage;
import acm.graphics.GRect;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class BlaiseY2 extends Critter{

    @Override
    protected void buildGraphics() {

        GRect leftLeg  = new GRect(55, 200, 35, 70);
        leftLeg.setColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(strokeColor);
        //addLeg(new Leg(leftLeg, 2));

        GRect rightLeg  = new GRect(100, 200, 35, 70);
        rightLeg.setColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(strokeColor);
        //addLeg(new Leg(rightLeg, 2));


        GImage android = null;
        try {
            android = new GImage(ImageIO.read(getClass().getResource("/android.png")));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        getGraphics().add(android);


        addEye(new Eye(12, 0.26, 0.18, Color.RED), 245, 79);
        addEye(new Eye(12, 0.26, 0.18, Color.RED), 335, 79);
    }


    private static final Color
            strokeColor = new Color(0, 0, 255),
            fillColor = new Color(100, 0,0);
}
