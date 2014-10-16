package edu.macalester.comp124.critters;

import acm.graphics.GImage;

import javax.imageio.ImageIO;
import java.io.IOException;

/**
 * Created by John on 16-Oct-14.
 */
public class JohnMBubbles extends Critter {

    @Override
    protected void buildGraphics() {
        GImage bubble = null;
        try {
            bubble = new GImage (ImageIO.read(getClass().getResource("/bubbles.png")));
        } catch (IOException e){
            e.printStackTrace();
        }
        bubble.scale(.6,.6);
        getGraphics().add(bubble);
    }
}
