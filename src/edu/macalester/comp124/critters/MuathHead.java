package edu.macalester.comp124.critters;

import acm.graphics.GCompound;
import acm.graphics.GOval;

import java.awt.*;

/**
 * Created by Muath Ibaid on 10/10/2014.
 */
public class MuathHead extends GCompound {

    public MuathHead(){
        GOval head = new GOval(40,20);
        GOval fullHead = new GOval(40, 60);
        GOval eye1 = new GOval(10, 10, 5, 5);
        GOval eye2 = new GOval(25, 10, 5, 5);
        GOval mouth = new GOval(13, 40, 15, 3);
        GOval nose = new GOval(17, 25, 10, 10);

        head.setFilled(true);
        head.setFillColor(Color.green);
        fullHead.setFilled(true);
        fullHead.setFillColor(Color.white);
        eye1.setFilled(true);
        eye1.setFillColor(Color.black);
        eye2.setFilled(true);
        eye2.setFillColor(Color.black);

        nose.setFilled(true);
        nose.setFillColor(Color.red);

        add(fullHead);
        add(head);
        add(eye1);
        add(eye2);
        add(mouth);
        add(nose);





    }
}
