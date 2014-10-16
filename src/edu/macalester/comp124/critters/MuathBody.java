package edu.macalester.comp124.critters;

import acm.graphics.GCompound;
import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;

import java.awt.*;

/**
 * Created by Muath Ibaid on 10/10/2014.
 */
public class MuathBody extends GCompound {

    public MuathBody(){
        GOval body = new GOval(-5, 60, 50, 70);
        body.setFilled(true);
        body.setFillColor(Color.green);
        GLabel label = new GLabel("Hi!", 12.5, 80);
        GLabel label2 = new GLabel("My name", -3, 90);
        GLabel label3 = new GLabel("is", 12.5, 100);
        GLabel label4 = new GLabel("BRET! ", 7 , 110);
        label4.setColor(Color.black);

        add(body);
        add(label);
        add(label2);
        add(label3);
        add(label4);

    }
}
