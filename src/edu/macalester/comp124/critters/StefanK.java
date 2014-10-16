package edu.macalester.comp124.critters;

import acm.graphics.GImage;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 * Created by ${Stefan} on ${10/3/2014}.
 * This class adds Slash.
 */

public class StefanK extends Critter {

    @Override
    protected void buildGraphics() {

        //bla
        GImage slash = null;
        try {
            slash = new GImage(ImageIO.read(getClass().getResource("/slash.png")));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        getGraphics().add(slash);
        addEye(new Eye(10, 0.26, 0.18, Color.GREEN), 75, 89);
        addEye(new Eye(10, 0.26, 0.18, Color.GREEN), 100, 81);
    }

}
