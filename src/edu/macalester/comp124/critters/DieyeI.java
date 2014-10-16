package edu.macalester.comp124.critters;
import acm.graphics.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 * Created by Ibrahima on 10/16/14.
 */
public class DieyeI extends Critter {

    protected void buildGraphics(){


    GImage simp = null;
    try {
        simp = new GImage(ImageIO.read(getClass().getResource("/simp.png")));
        simp.scale(0.7);
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }


    getGraphics().add(simp);

}

}




