package edu.macalester.comp124.critters;

import acm.graphics.GImage;
import acm.graphics.GRect;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 * Created by jenni on 10/16/14.
 */
public class JenniS extends Critter {
    @Override
    protected void buildGraphics() {


        GImage foxCritter = null;
        try {
            foxCritter = new GImage(ImageIO.read(getClass().getResource("/foxCritter.png")));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        getGraphics().add(foxCritter);

        addEye(new Eye(35, 0.26, 0.18, Color.BLUE), 65, 80);
        addEye(new Eye(35, 0.26, 0.18, Color.BLUE), 125, 80);
    }
}