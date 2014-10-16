package edu.macalester.comp124.critters;

import acm.graphics.GImage;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 * Created by talhaahsan on 10/16/14.
 */
public class YoshiTalha extends Critter
{
    @Override
    protected void buildGraphics()
    {
        boolean egg = true;
        GImage yoshi = null;
        if (System.currentTimeMillis() %2 == 0)
        {
            egg = false;
            try
            {
                yoshi = new GImage(ImageIO.read(getClass().getResource("/PM2_Yoshi.PNG")));
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            try
            {
                yoshi = new GImage(ImageIO.read(getClass().getResource("/YoshiEgg.PNG")));
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            setSpeed(0);
        }


        getGraphics().add(yoshi);

        if(!egg)
        {
            addEye(new Eye(15, 0.26, 0.18, Color.green), 50, 35);
            addEye(new Eye(15, 0.3, 0.18, Color.GREEN), 70, 35);
        }
    }
}
