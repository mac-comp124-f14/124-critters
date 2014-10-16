//package edu.macalester.comp124.critters;
//
//import acm.graphics.GLine;
//import acm.graphics.*;
//import acm.util.RandomGenerator;
//
//import java.awt.*;
//
///**
// * Created by mcartier on 10/16/14.
// */
//public class MJellyFish extends Critter {
//
//    @Override
//    protected void buildGraphics() {
//        int xVal = 50;
//        for (int i = 0; i < 24; i++) {
//            RandomGenerator rando = new RandomGenerator();
//            int yVal = rando.nextInt(60, 240);
//            GLine l = new GLine(xVal, 80, xVal, yVal);
//            l.setColor(Color.black);
//            xVal += 7;
//            addLeg(new Leg(l, 6));
//        }
//        GOval body = new GOval(20, 50, 200, 100);
//        body.setFilled(true);
//        body.setFillColor(Color.black);
//        getGraphics().add(body);
//
//        Eye leftEye = new Eye(20, .4, 0.3, Color.orange);
//        Eye rightEye = new Eye(20, .4, 0.3, Color.orange);
//
//        addEye(leftEye, 75, 80);
//        addEye(rightEye, 150, 80);
//    }
//}
