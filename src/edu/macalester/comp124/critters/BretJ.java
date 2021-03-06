package edu.macalester.comp124.critters;

import acm.graphics.GImage;
import acm.graphics.GRect;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 * Created by bjackson on 10/16/2014.
 */
public class BretJ extends Critter {

    @Override
    protected void buildGraphics() {

        GRect leftLeg  = new GRect(42, 155, 2, 40);
        leftLeg.setColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(strokeColor);
        addLeg(new Leg(leftLeg, 2));

        GRect rightLeg  = new GRect(73, 160, 2, 40);
        rightLeg.setColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(strokeColor);
        addLeg(new Leg(rightLeg, 2));


        GImage mario = null;
        try {
            mario = new GImage(ImageIO.read(getClass().getResource("/jackson-banana.png")));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        getGraphics().add(mario);


        addEye(new Eye(10, 0.26, 0.18, Color.RED), 45, 88);
        addEye(new Eye(10, 0.26, 0.18, Color.RED), 76, 88);
    }


    private static final Color
            strokeColor = new Color(0, 0, 0),
            fillColor = new Color(100, 0,0);
}

