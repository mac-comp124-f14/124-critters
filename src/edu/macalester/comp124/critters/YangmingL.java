package edu.macalester.comp124.critters;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GRect;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 * Created by Yangming Li on 10/16/14.
 */

public class YangmingL extends Critter{

    @Override
    protected void buildGraphics() {
        GRect leftLeg  = new GRect(-16, 0, 10, 40);
        leftLeg.setColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(fillColor);
        addLeg(new Leg(leftLeg, 2));

        GRect rightLeg = new GRect( 6, 0, 10, 40);
        rightLeg.setColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(fillColor);
        addLeg(new Leg(rightLeg, 2));

        GRect body = new GRect(-20, -30, 40, 40);
        body.setColor(strokeColor);
        body.setFilled(true);
        body.setFillColor(fillColor);
        getGraphics().add(body);

        GRect rightArm = new GRect(-40,-20,20,10);
        rightArm.setColor(strokeColor);
        rightArm.setFilled(true);
        rightArm.setFillColor(fillColor);
        getGraphics().add(rightArm);

        GRect leftArm = new GRect(20,-20,20,10);
        leftArm.setColor(strokeColor);
        leftArm.setFilled(true);
        leftArm.setFillColor(fillColor);
        getGraphics().add(leftArm);

        GLabel name = new GLabel("Yangming");
        name.setColor(Color.blue);
        name.setFont("Serif-9");
        getGraphics().add(name,-20,-10);


        GImage yangming = null;
        try {
            yangming = new GImage(ImageIO.read(getClass().getResource("/yangming.png")));
            yangming.scale(.25);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        getGraphics().add(yangming,-15,-70);
    }

    private static final Color
            strokeColor = Color.black,
            fillColor   = Color.orange;
}