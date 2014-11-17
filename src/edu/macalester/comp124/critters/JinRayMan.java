package edu.macalester.comp124.critters;

import acm.graphics.GImage;
import acm.graphics.GRect;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 * Created by jlee11 on 10/16/14.
 */
public class JinRayMan extends Critter {
    @Override
    protected void buildGraphics() {
        GRect leftLeg  = new GRect(25,240, 70, 35);
        leftLeg.setColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(strokeColor);
        addLeg(new Leg(leftLeg, 4));

        GRect rightLeg  = new GRect(120, 240, 70, 35);
        rightLeg.setColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(strokeColor);
        addLeg(new Leg(rightLeg, 4));


        GImage rayman = null;
        try {
            rayman = new GImage(ImageIO.read(getClass().getResource("/rayman.png")));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        getGraphics().add(rayman);

        addEye(new Eye(20, 0.4, 0.18, Color.RED), 104, 57);
        addEye(new Eye(20, 0.4, 0.18, Color.RED), 143, 67);
    }
    private static final Color
            strokeColor = new Color(220, 220, 225),
            fillColor = new Color(100, 0,0);

}
