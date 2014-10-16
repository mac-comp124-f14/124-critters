package edu.macalester.comp124.critters;

import acm.graphics.GCompound;

/**
 * Created by Muath Ibaid on 10/10/2014.
 */
public class MuathHuman extends GCompound {

    public MuathHuman(){
        MuathHead head = new MuathHead();
        add(head);

//        BackGround comp = new BackGround();
//        add(comp);

        MuathBody body = new MuathBody();
        add(body);

        MuathHands hands = new MuathHands();
        add(hands);

//        MuathLegs legs = new MuathLegs();
//        add(legs);

        MuathHair hair = new MuathHair();
        add(hair);


    }
}
