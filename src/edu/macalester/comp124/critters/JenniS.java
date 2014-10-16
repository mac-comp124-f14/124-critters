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
    }
}


//        addEye(new Eye(10, 0.26, 0.18, Color.RED), 85, 70);
//        addEye(new Eye(10, 0.26, 0.18, Color.RED), 110, 70);
//    }
//
//
//    private static final Color
//            strokeColor = new Color(0, 0, 255),
//            fillColor = new Color(100, 0,0);
//}
