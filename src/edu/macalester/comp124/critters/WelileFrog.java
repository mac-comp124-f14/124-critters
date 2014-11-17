package edu.macalester.comp124.critters;

import acm.graphics.GImage;
import acm.graphics.GRect;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 * Created by welilegloryzwane on 16/10/14.
 */
public class WelileFrog extends Critter {

    @Override
    protected void buildGraphics(){
        GRect leftLeg  = new GRect(125, 105, 4, 60);
        leftLeg.setColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(strokeColor);
        addLeg(new Leg(leftLeg, 2));

        GRect rightLeg  = new GRect(153, 105, 4, 60);
        rightLeg.setColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(strokeColor);
        addLeg(new Leg(rightLeg, 2));


        GImage frog = null;
        try {
            frog = new GImage(ImageIO.read(getClass().getResource("/Frog.png")));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        getGraphics().add(frog);


        addEye(new Eye(7, 0.26, 0.18, Color.RED), 130, 25);
        addEye(new Eye(7, 0.26, 0.18, Color.RED), 155, 25);
    }

    private static final Color
        strokeColor = new Color(43, 133, 41),
        fillColor = new Color(100, 0,0);
}
