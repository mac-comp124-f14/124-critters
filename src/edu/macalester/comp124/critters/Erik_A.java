package edu.macalester.comp124.critters;

import acm.graphics.GImage;
import acm.graphics.GRect;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 * Created by ealfvin on 10/16/14.
 */
public class Erik_A extends Critter {

    @Override
    protected void buildGraphics() {
        GImage godzilla = null;
        try {
            godzilla = new GImage(ImageIO.read(getClass().getResource("/Godzilla-psd30941.png")));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        GImage mothra = null;
        try {
            mothra = new GImage(ImageIO.read(getClass().getResource("/Godzilla_Save_The_Earth_MOTHRA_IMAGO.png")));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        GImage flame = null;
        try {
            flame = new GImage(ImageIO.read(getClass().getResource("/Flame_Thrower_1.png")));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        GRect rightLeg  = new GRect(130, 250, 30, 60);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(Color.black);
        addLeg(new Leg(rightLeg, 5));

        GRect leftLeg  = new GRect(195, 250, 30, 60);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(Color.black);
        addLeg(new Leg(leftLeg, 5));

        getGraphics().add(godzilla);
        getGraphics().add(mothra);
        getGraphics().add(flame);
        flame.move(39, 46);
        mothra.move(38, 10);

        Eye rightEye = new Eye(7, 0.5, 0.18, Color.RED);
        Eye leftEye = new Eye(3.5, 0.35, 0.18, Color.RED);

        addEye(rightEye, 147, 40);
        addEye(leftEye, 133, 40);
    }
}
