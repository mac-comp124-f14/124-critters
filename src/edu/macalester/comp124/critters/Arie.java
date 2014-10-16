package edu.macalester.comp124.critters;

import acm.graphics.GImage;
import acm.graphics.GRect;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 * @author Paul Cantrell
 */
public class Arie extends Critter {


    @Override
    protected void buildGraphics() {

        GRect leftLeg  = new GRect(45, 100, 15, 60);
        leftLeg.setColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(fillColor);
        addLeg(new Leg(leftLeg, 2));

        GRect rightLeg  = new GRect(70, 100, 15, 60);
        rightLeg.setColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(fillColor);
        addLeg(new Leg(rightLeg, 2));


        GImage spongeBob = null;
        try {
            spongeBob = new GImage(ImageIO.read(getClass().getResource("/spongeBob.png")));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        getGraphics().add(spongeBob);


        addEye(new Eye(10, 0.26, 0.18, Color.BLUE), 50, 40);
        addEye(new Eye(10, 0.26, 0.18, Color.BLUE), 80, 40);
    }


    private static final Color
            strokeColor = new Color(0, 0, 0),
            fillColor = new Color(255,255,51);
}

