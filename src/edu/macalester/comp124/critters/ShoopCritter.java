package edu.macalester.comp124.critters;

import acm.graphics.*;

import java.awt.*;

/**
 * Created by shoop on 10/16/14.
 */
public class ShoopCritter extends Critter {

    @Override
    protected void buildGraphics() {
        GOval body = new GOval(30, 80);
        getGraphics().add(body);

        GRect neck = new GRect(4,20);
        neck.setFilled(true);
        neck.setColor(Color.BLACK);
        getGraphics().add(neck);
        neck.move(11,-18);

        GOval head = new GOval(40,40);
        getGraphics().add(head);
        head.move(0,-58);

        GCompound leg1 = createLeg();
        leg1.move(15, 60);
        addLeg(new Leg(leg1, 4));

        GCompound leg2 = createLeg();
        leg2.move(-5, 60);
        addLeg(new Leg(leg2, 4));

        GCompound beak = makeBeak();
        getGraphics().add(beak);
        beak.move(35, -42);

        GCompound wing = makeWing(true);
        getGraphics().add(wing);
        wing.move(25, 12);

        GCompound wingL = makeWing(false);
        getGraphics().add(wingL);
        wingL.move(3, 12);

    }

    /*
     * Chicken or bird foot from striaght lines
     */
    private GCompound createLeg() {
        GCompound chickenLeg = new GCompound();

        //draw straight edge down
        GLine   leg = new GLine(10,0,10,30);
        GLine footLeft = new GLine(0,30,10,20);
        GLine footRight = new GLine(20,30,10,20);
        chickenLeg.add(leg);
        chickenLeg.add(footLeft);
        chickenLeg.add(footRight);

        return chickenLeg;
    }

    private GCompound makeBeak() {
        GCompound beak = new GCompound();
        GLine top = new GLine(0,0,20, 10);
        GLine bottom = new GLine(20,10, 0,14);
        beak.add(top);
        beak.add(bottom);

        return beak;
    }

    private GCompound makeWing(boolean isRight) {
        GCompound wing = new GCompound();
        GLine top;
        GLine bottom;

        if (isRight) {
            top = new GLine(0, 0, 20, 60);
            bottom = new GLine(20, 60, 5, 40);
        } else {
            top = new GLine(0, 0, -20, 60);
            bottom = new GLine(-20, 60, -5, 40);
        }
        wing.add(top);
        wing.add(bottom);

        return wing;
    }
}
