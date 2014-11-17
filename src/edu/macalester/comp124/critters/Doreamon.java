package edu.macalester.comp124.critters;

import acm.graphics.GImage;
import acm.graphics.GRect;
import acm.graphics.GOval;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 * Created by dnguyen1 on 10/16/14.
 */
public class Doreamon extends Critter{

    protected void buildGraphics() {
        GRect leftLeg = new GRect(55, 200, 35, 20);
        GOval feet = new GOval(40, 210, 50, 20);
        feet.setFillColor(Color.WHITE);
        feet.setFilled(true);
        leftLeg.setColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(strokeColor);
        addLeg(new Leg(leftLeg, 2));
        addLeg(new Leg(feet, 2));

        GRect rightLeg = new GRect(110, 200, 35, 20);
        GOval feet2 = new GOval(95, 210, 50, 20);
        feet2.setFillColor(Color.WHITE);
        feet2.setFilled(true);
        rightLeg.setColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(strokeColor);
        addLeg(new Leg(rightLeg, 2));
        addLeg(new Leg(feet2, 3));


        GImage doreamon = null;
        try {
            doreamon = new GImage(ImageIO.read(getClass().getResource("/Doreamon.png")));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        getGraphics().add(doreamon);


        addEye(new Eye(10, 0.26, 0.2, Color.BLACK), 85, 40);
        addEye(new Eye(10, 0.26, 0.2, Color.BLACK), 110, 40);


    }

    private static final Color
            strokeColor = new Color(42, 143, 199),
            fillColor = new Color(100, 0, 0);
}
